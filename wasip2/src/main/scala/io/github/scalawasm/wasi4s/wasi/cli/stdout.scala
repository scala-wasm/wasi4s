package io.github.scalawasm.wasi4s.wasi.cli

package object stdout {

  // Type definitions
  type OutputStream = io.github.scalawasm.wasi4s.wasi.io.streams.OutputStream

  // Functions
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "stdout", "0.2.12"), "get-stdout")
  def getStdout(): OutputStream = scala.scalajs.wit.native

}
