package io.github.scalawasm.wasi4s.wasi.cli

package object stderr {

  // Type definitions
  type OutputStream = io.github.scalawasm.wasi4s.wasi.io.streams.OutputStream

  // Functions
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "stderr", "0.2.12"), "get-stderr")
  def getStderr(): OutputStream = scala.scalajs.wit.native

}
