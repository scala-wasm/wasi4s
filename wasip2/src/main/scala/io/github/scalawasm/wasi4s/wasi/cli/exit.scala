package io.github.scalawasm.wasi4s.wasi.cli

package object exit {

  // Functions
  /** Exit the current instance and any linked instances.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "exit", "0.2.12"), "exit")
  def exit(@scala.scalajs.wit.annotation.WitName("status") status: scala.scalajs.wit.Result[Unit, Unit]): Unit = scala.scalajs.wit.native

  /** Exit the current instance and any linked instances, reporting the
   *  specified status code to the host.
   *
   *  The meaning of the code depends on the context, with 0 usually meaning
   *  "success", and other values indicating various types of failure.
   *
   *  This function does not return; the effect is analogous to a trap, but
   *  without the connotation that something bad has happened.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "cli", "exit", "0.2.12"), "exit-with-code")
  def exitWithCode(@scala.scalajs.wit.annotation.WitName("status-code") statusCode: scala.scalajs.wit.unsigned.UByte): Unit = scala.scalajs.wit.native

}
