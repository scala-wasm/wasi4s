package io.github.scalawasm.wasi4s.wasi.cli

package object terminal_stderr {

  // Type definitions
  type TerminalOutput = io.github.scalawasm.wasi4s.wasi.cli.terminal_output.TerminalOutput

  // Functions
  /** If stderr is connected to a terminal, return a `terminal-output` handle
   *  allowing further interaction with it.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "terminal-stderr", "0.2.12"), "get-terminal-stderr")
  def getTerminalStderr(): scala.scalajs.wit.Option[TerminalOutput] = scala.scalajs.wit.native

}
