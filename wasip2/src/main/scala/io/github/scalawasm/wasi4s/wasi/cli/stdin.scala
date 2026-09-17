package io.github.scalawasm.wasi4s.wasi.cli

package object stdin {

  // Type definitions
  type InputStream = io.github.scalawasm.wasi4s.wasi.io.streams.InputStream

  // Functions
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "stdin", "0.2.12"), "get-stdin")
  def getStdin(): InputStream = scala.scalajs.wit.native

}
