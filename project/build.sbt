libraryDependencies += "io.github.scala-wasm" %% "scalajs-env-wasmtime" % "0.1.0"

// sbt-scalajs 1.22.1-wasm.5 still pulls 0.0.2; prefer the explicit dependency above.
libraryDependencySchemes += "io.github.scala-wasm" %% "scalajs-env-wasmtime" % "always"
