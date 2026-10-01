import org.scalajs.ir.WitScope
import org.scalajs.jsenv.wasmtime.WasmtimeEnv
import org.scalajs.linker.interface.ESVersion
import org.scalajs.linker.interface.ModuleKind
import org.scalajs.linker.interface.WasmComponentModuleInitializerExport
import org.scalajs.linker.interface.WasmComponentModuleInitializerExport._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbtdynver.DynVerPlugin.autoImport._

import scala.sys.process.Process
import scala.util.Try

val Scala212 = "2.12.21"
val Scala213 = "2.13.18"

def gitReleaseVersion: Option[String] =
  Try(Process("git describe --exact-match --tags HEAD").!!.trim)
    .toOption
    .map(_.stripPrefix("v"))

val publishSettings = Seq(
  // ThisBuild scope: ci-release pulls in DynVer, but +wasi tags break dynver's git describe parser.
  ThisBuild / dynverGitDescribeOutput := None,
  ThisBuild / version := gitReleaseVersion.getOrElse("0.0.0-SNAPSHOT"),
  ThisBuild / isSnapshot := version.value.endsWith("-SNAPSHOT"),
  organization := "io.github.scala-wasm",
  versionScheme := Some("semver-spec"),
  homepage := Some(url("https://github.com/scala-wasm/wasi4s")),
  licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0")),
  developers := List(
    Developer(
      "tanishiking",
      "tanishiking",
      "rikitotaniguchi@proton.me",
      url("https://github.com/tanishiking")
    )
  ),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/scala-wasm/wasi4s"),
      "scm:git:git@github.com:scala-wasm/wasi4s.git"
    )
  ),
)

lazy val componentTestSettings = Def.settings(
  Test / scalaJSUseTestModuleInitializer := true,
  scalaJSUseMainModuleInitializer := false,
  jsEnv := new WasmtimeEnv(),
  Test / scalaJSLinkerConfig := {
    val witDir = baseDirectory.value / "wit"
    (Test / scalaJSLinkerConfig).value
      .withESFeatures(_.withUseWebAssembly(true).withESVersion(ESVersion.ES2022))
      .withModuleKind(ModuleKind.WasmComponent)
      .withWasmFeatures { features =>
        features
          .withWitDirectory(Some(witDir.getAbsolutePath))
          .withWitWorld(Some("command"))
          .withModuleInitializerExport(Some(
            WasmComponentModuleInitializerExport(
              scope = WitScope.Interface("wasi", "cli", "run", Some("0.2.12")),
              functionName = "run",
              resultType = ResultType.ResultUnitUnit,
            )))
      }
  },
)

lazy val root = project
  .in(file("."))
  .aggregate(wasip2, tests)
  .settings(
    crossScalaVersions := Nil,
    publish / skip := true
  )

lazy val wasip2 = project
  .in(file("wasip2"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    publishSettings,
    name := "wasi4s",
    moduleName := "wasi4s",
    scalaVersion := Scala213,
    crossScalaVersions := Seq(Scala212, Scala213),
    scalacOptions ++= Seq("-deprecation", "-feature"),
    scalaJSUseMainModuleInitializer := false,
  )

lazy val tests = project
  .in(file("tests"))
  .dependsOn(wasip2)
  .enablePlugins(ScalaJSPlugin, ScalaJSJUnitPlugin)
  .settings(
    componentTestSettings,
    scalaVersion := Scala213,
    crossScalaVersions := Seq(Scala212, Scala213),
    publish / skip := true,
    name := "wasi4s-tests",
  )
