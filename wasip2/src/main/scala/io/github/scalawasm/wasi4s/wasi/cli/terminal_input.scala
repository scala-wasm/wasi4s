package io.github.scalawasm.wasi4s.wasi.cli

package object terminal_input {

  // Resources
  /** The input side of a terminal.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "terminal-input", "0.2.12"), "terminal-input")
  final class TerminalInput private () extends Object {
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object TerminalInput {
  }

}
