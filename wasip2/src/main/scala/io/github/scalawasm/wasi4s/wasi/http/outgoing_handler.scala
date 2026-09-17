package io.github.scalawasm.wasi4s.wasi.http

package object outgoing_handler {

  // Type definitions
  type OutgoingRequest = io.github.scalawasm.wasi4s.wasi.http.types.OutgoingRequest

  type RequestOptions = io.github.scalawasm.wasi4s.wasi.http.types.RequestOptions

  type FutureIncomingResponse = io.github.scalawasm.wasi4s.wasi.http.types.FutureIncomingResponse

  type ErrorCode = io.github.scalawasm.wasi4s.wasi.http.types.ErrorCode

  // Functions
  /** This function is invoked with an outgoing HTTP Request, and it returns
   *  a resource `future-incoming-response` which represents an HTTP Response
   *  which may arrive in the future.
   *
   *  The `options` argument accepts optional parameters for the HTTP
   *  protocol's transport layer.
   *
   *  This function may return an error if the `outgoing-request` is invalid
   *  or not allowed to be made. Otherwise, protocol errors are reported
   *  through the `future-incoming-response`.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "outgoing-handler", "0.2.12"), "handle")
  def handle(@scala.scalajs.wit.annotation.WitName("request") request: OutgoingRequest, @scala.scalajs.wit.annotation.WitName("options") options: scala.scalajs.wit.Option[RequestOptions]): scala.scalajs.wit.Result[FutureIncomingResponse, ErrorCode] = scala.scalajs.wit.native

}
