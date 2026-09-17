package io.github.scalawasm.wasi4s.wasi.cli

package object terminal_stdin {

  // Type definitions
  type TerminalInput = io.github.scalawasm.wasi4s.wasi.cli.terminal_input.TerminalInput

  // Functions
  /** If stdin is connected to a terminal, return a `terminal-input` handle
   *  allowing further interaction with it.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "terminal-stdin", "0.2.12"), "get-terminal-stdin")
  def getTerminalStdin(): scala.scalajs.wit.Option[TerminalInput] = scala.scalajs.wit.native

}
