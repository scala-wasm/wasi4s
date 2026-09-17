package io.github.scalawasm.wasi4s.wasi.cli

package object terminal_stdout {

  // Type definitions
  type TerminalOutput = io.github.scalawasm.wasi4s.wasi.cli.terminal_output.TerminalOutput

  // Functions
  /** If stdout is connected to a terminal, return a `terminal-output` handle
   *  allowing further interaction with it.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "terminal-stdout", "0.2.12"), "get-terminal-stdout")
  def getTerminalStdout(): scala.scalajs.wit.Option[TerminalOutput] = scala.scalajs.wit.native

}
