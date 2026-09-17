package io.github.scalawasm.wasi4s.wasi.cli

package object terminal_output {

  // Resources
  /** The output side of a terminal.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "terminal-output", "0.2.12"), "terminal-output")
  final class TerminalOutput private () extends Object {
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object TerminalOutput {
  }

}
