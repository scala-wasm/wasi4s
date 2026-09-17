package io.github.scalawasm.wasi4s.wasi.http

package object types {

  // Type definitions
  type Duration = io.github.scalawasm.wasi4s.wasi.clocks.monotonic_clock.Duration

  type InputStream = io.github.scalawasm.wasi4s.wasi.io.streams.InputStream

  type OutputStream = io.github.scalawasm.wasi4s.wasi.io.streams.OutputStream

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "io-error")
  type IoError = io.github.scalawasm.wasi4s.wasi.io.error.Error

  type Pollable = io.github.scalawasm.wasi4s.wasi.io.poll.Pollable

  /** This type corresponds to HTTP standard Methods.
   */
  @scala.scalajs.wit.annotation.WitVariant(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "method")
  sealed trait Method
  object Method {
    @scala.scalajs.wit.annotation.WitName("get")
    object Get extends Method {
      override def toString(): String = "Get"
    }
    @scala.scalajs.wit.annotation.WitName("head")
    object Head extends Method {
      override def toString(): String = "Head"
    }
    @scala.scalajs.wit.annotation.WitName("post")
    object Post extends Method {
      override def toString(): String = "Post"
    }
    @scala.scalajs.wit.annotation.WitName("put")
    object Put extends Method {
      override def toString(): String = "Put"
    }
    @scala.scalajs.wit.annotation.WitName("delete")
    object Delete extends Method {
      override def toString(): String = "Delete"
    }
    @scala.scalajs.wit.annotation.WitName("connect")
    object Connect extends Method {
      override def toString(): String = "Connect"
    }
    @scala.scalajs.wit.annotation.WitName("options")
    object Options extends Method {
      override def toString(): String = "Options"
    }
    @scala.scalajs.wit.annotation.WitName("trace")
    object Trace extends Method {
      override def toString(): String = "Trace"
    }
    @scala.scalajs.wit.annotation.WitName("patch")
    object Patch extends Method {
      override def toString(): String = "Patch"
    }
    @scala.scalajs.wit.annotation.WitName("other")
    final class Other(@scala.scalajs.wit.annotation.WitName("value") val value: String) extends Method {
      override def equals(other: Any): Boolean = other match {
        case that: Other => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "Other(" + value + ")"
    }
    object Other {
      def apply(value: String): Other = new Other(value)
      def unapply(arg: Other): Some[String] = Some(arg.value)
    }
  }

  /** This type corresponds to HTTP standard Related Schemes.
   */
  @scala.scalajs.wit.annotation.WitVariant(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "scheme")
  sealed trait Scheme
  object Scheme {
    @scala.scalajs.wit.annotation.WitName("HTTP")
    object Http extends Scheme {
      override def toString(): String = "Http"
    }
    @scala.scalajs.wit.annotation.WitName("HTTPS")
    object Https extends Scheme {
      override def toString(): String = "Https"
    }
    @scala.scalajs.wit.annotation.WitName("other")
    final class Other(@scala.scalajs.wit.annotation.WitName("value") val value: String) extends Scheme {
      override def equals(other: Any): Boolean = other match {
        case that: Other => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "Other(" + value + ")"
    }
    object Other {
      def apply(value: String): Other = new Other(value)
      def unapply(arg: Other): Some[String] = Some(arg.value)
    }
  }

  /** Defines the case payload type for `DNS-error` above:
   */
  @scala.scalajs.wit.annotation.WitRecord(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "DNS-error-payload")
  final class DnsErrorPayload(@scala.scalajs.wit.annotation.WitName("rcode") val rcode: scala.scalajs.wit.Option[String], @scala.scalajs.wit.annotation.WitName("info-code") val infoCode: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UShort]) {
    override def equals(other: Any): Boolean = other match {
      case that: DnsErrorPayload => this.rcode == that.rcode && this.infoCode == that.infoCode
      case _ => false
    }
    override def hashCode(): Int = {
      var result = 1
      result = 31 * result + rcode.hashCode()
      result = 31 * result + infoCode.hashCode()
      result
    }
    override def toString(): String = "DnsErrorPayload(" + rcode + ", " + infoCode + ")"
  }
  object DnsErrorPayload {
    def apply(rcode: scala.scalajs.wit.Option[String], infoCode: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UShort]): DnsErrorPayload = new DnsErrorPayload(rcode, infoCode)
    def unapply(arg: DnsErrorPayload): Some[(scala.scalajs.wit.Option[String], scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UShort])] = Some((arg.rcode, arg.infoCode))
  }

  /** Defines the case payload type for `TLS-alert-received` above:
   */
  @scala.scalajs.wit.annotation.WitRecord(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "TLS-alert-received-payload")
  final class TlsAlertReceivedPayload(@scala.scalajs.wit.annotation.WitName("alert-id") val alertId: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UByte], @scala.scalajs.wit.annotation.WitName("alert-message") val alertMessage: scala.scalajs.wit.Option[String]) {
    override def equals(other: Any): Boolean = other match {
      case that: TlsAlertReceivedPayload => this.alertId == that.alertId && this.alertMessage == that.alertMessage
      case _ => false
    }
    override def hashCode(): Int = {
      var result = 1
      result = 31 * result + alertId.hashCode()
      result = 31 * result + alertMessage.hashCode()
      result
    }
    override def toString(): String = "TlsAlertReceivedPayload(" + alertId + ", " + alertMessage + ")"
  }
  object TlsAlertReceivedPayload {
    def apply(alertId: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UByte], alertMessage: scala.scalajs.wit.Option[String]): TlsAlertReceivedPayload = new TlsAlertReceivedPayload(alertId, alertMessage)
    def unapply(arg: TlsAlertReceivedPayload): Some[(scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UByte], scala.scalajs.wit.Option[String])] = Some((arg.alertId, arg.alertMessage))
  }

  /** Defines the case payload type for `HTTP-response-{header,trailer}-size` above:
   */
  @scala.scalajs.wit.annotation.WitRecord(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "field-size-payload")
  final class FieldSizePayload(@scala.scalajs.wit.annotation.WitName("field-name") val fieldName: scala.scalajs.wit.Option[String], @scala.scalajs.wit.annotation.WitName("field-size") val fieldSize: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]) {
    override def equals(other: Any): Boolean = other match {
      case that: FieldSizePayload => this.fieldName == that.fieldName && this.fieldSize == that.fieldSize
      case _ => false
    }
    override def hashCode(): Int = {
      var result = 1
      result = 31 * result + fieldName.hashCode()
      result = 31 * result + fieldSize.hashCode()
      result
    }
    override def toString(): String = "FieldSizePayload(" + fieldName + ", " + fieldSize + ")"
  }
  object FieldSizePayload {
    def apply(fieldName: scala.scalajs.wit.Option[String], fieldSize: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]): FieldSizePayload = new FieldSizePayload(fieldName, fieldSize)
    def unapply(arg: FieldSizePayload): Some[(scala.scalajs.wit.Option[String], scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt])] = Some((arg.fieldName, arg.fieldSize))
  }

  /** These cases are inspired by the IANA HTTP Proxy Error Types:
   *    <https://www.iana.org/assignments/http-proxy-status/http-proxy-status.xhtml#table-http-proxy-error-types>
   */
  @scala.scalajs.wit.annotation.WitVariant(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "error-code")
  sealed trait ErrorCode
  object ErrorCode {
    @scala.scalajs.wit.annotation.WitName("DNS-timeout")
    object DnsTimeout extends ErrorCode {
      override def toString(): String = "DnsTimeout"
    }
    @scala.scalajs.wit.annotation.WitName("DNS-error")
    final class DnsError(@scala.scalajs.wit.annotation.WitName("value") val value: DnsErrorPayload) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: DnsError => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "DnsError(" + value + ")"
    }
    object DnsError {
      def apply(value: DnsErrorPayload): DnsError = new DnsError(value)
      def unapply(arg: DnsError): Some[DnsErrorPayload] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("destination-not-found")
    object DestinationNotFound extends ErrorCode {
      override def toString(): String = "DestinationNotFound"
    }
    @scala.scalajs.wit.annotation.WitName("destination-unavailable")
    object DestinationUnavailable extends ErrorCode {
      override def toString(): String = "DestinationUnavailable"
    }
    @scala.scalajs.wit.annotation.WitName("destination-IP-prohibited")
    object DestinationIpProhibited extends ErrorCode {
      override def toString(): String = "DestinationIpProhibited"
    }
    @scala.scalajs.wit.annotation.WitName("destination-IP-unroutable")
    object DestinationIpUnroutable extends ErrorCode {
      override def toString(): String = "DestinationIpUnroutable"
    }
    @scala.scalajs.wit.annotation.WitName("connection-refused")
    object ConnectionRefused extends ErrorCode {
      override def toString(): String = "ConnectionRefused"
    }
    @scala.scalajs.wit.annotation.WitName("connection-terminated")
    object ConnectionTerminated extends ErrorCode {
      override def toString(): String = "ConnectionTerminated"
    }
    @scala.scalajs.wit.annotation.WitName("connection-timeout")
    object ConnectionTimeout extends ErrorCode {
      override def toString(): String = "ConnectionTimeout"
    }
    @scala.scalajs.wit.annotation.WitName("connection-read-timeout")
    object ConnectionReadTimeout extends ErrorCode {
      override def toString(): String = "ConnectionReadTimeout"
    }
    @scala.scalajs.wit.annotation.WitName("connection-write-timeout")
    object ConnectionWriteTimeout extends ErrorCode {
      override def toString(): String = "ConnectionWriteTimeout"
    }
    @scala.scalajs.wit.annotation.WitName("connection-limit-reached")
    object ConnectionLimitReached extends ErrorCode {
      override def toString(): String = "ConnectionLimitReached"
    }
    @scala.scalajs.wit.annotation.WitName("TLS-protocol-error")
    object TlsProtocolError extends ErrorCode {
      override def toString(): String = "TlsProtocolError"
    }
    @scala.scalajs.wit.annotation.WitName("TLS-certificate-error")
    object TlsCertificateError extends ErrorCode {
      override def toString(): String = "TlsCertificateError"
    }
    @scala.scalajs.wit.annotation.WitName("TLS-alert-received")
    final class TlsAlertReceived(@scala.scalajs.wit.annotation.WitName("value") val value: TlsAlertReceivedPayload) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: TlsAlertReceived => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "TlsAlertReceived(" + value + ")"
    }
    object TlsAlertReceived {
      def apply(value: TlsAlertReceivedPayload): TlsAlertReceived = new TlsAlertReceived(value)
      def unapply(arg: TlsAlertReceived): Some[TlsAlertReceivedPayload] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-denied")
    object HttpRequestDenied extends ErrorCode {
      override def toString(): String = "HttpRequestDenied"
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-length-required")
    object HttpRequestLengthRequired extends ErrorCode {
      override def toString(): String = "HttpRequestLengthRequired"
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-body-size")
    final class HttpRequestBodySize(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.ULong]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpRequestBodySize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpRequestBodySize(" + value + ")"
    }
    object HttpRequestBodySize {
      def apply(value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.ULong]): HttpRequestBodySize = new HttpRequestBodySize(value)
      def unapply(arg: HttpRequestBodySize): Some[scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.ULong]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-method-invalid")
    object HttpRequestMethodInvalid extends ErrorCode {
      override def toString(): String = "HttpRequestMethodInvalid"
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-URI-invalid")
    object HttpRequestUriInvalid extends ErrorCode {
      override def toString(): String = "HttpRequestUriInvalid"
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-URI-too-long")
    object HttpRequestUriTooLong extends ErrorCode {
      override def toString(): String = "HttpRequestUriTooLong"
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-header-section-size")
    final class HttpRequestHeaderSectionSize(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpRequestHeaderSectionSize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpRequestHeaderSectionSize(" + value + ")"
    }
    object HttpRequestHeaderSectionSize {
      def apply(value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]): HttpRequestHeaderSectionSize = new HttpRequestHeaderSectionSize(value)
      def unapply(arg: HttpRequestHeaderSectionSize): Some[scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-header-size")
    final class HttpRequestHeaderSize(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[FieldSizePayload]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpRequestHeaderSize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpRequestHeaderSize(" + value + ")"
    }
    object HttpRequestHeaderSize {
      def apply(value: scala.scalajs.wit.Option[FieldSizePayload]): HttpRequestHeaderSize = new HttpRequestHeaderSize(value)
      def unapply(arg: HttpRequestHeaderSize): Some[scala.scalajs.wit.Option[FieldSizePayload]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-trailer-section-size")
    final class HttpRequestTrailerSectionSize(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpRequestTrailerSectionSize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpRequestTrailerSectionSize(" + value + ")"
    }
    object HttpRequestTrailerSectionSize {
      def apply(value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]): HttpRequestTrailerSectionSize = new HttpRequestTrailerSectionSize(value)
      def unapply(arg: HttpRequestTrailerSectionSize): Some[scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-request-trailer-size")
    final class HttpRequestTrailerSize(@scala.scalajs.wit.annotation.WitName("value") val value: FieldSizePayload) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpRequestTrailerSize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpRequestTrailerSize(" + value + ")"
    }
    object HttpRequestTrailerSize {
      def apply(value: FieldSizePayload): HttpRequestTrailerSize = new HttpRequestTrailerSize(value)
      def unapply(arg: HttpRequestTrailerSize): Some[FieldSizePayload] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-incomplete")
    object HttpResponseIncomplete extends ErrorCode {
      override def toString(): String = "HttpResponseIncomplete"
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-header-section-size")
    final class HttpResponseHeaderSectionSize(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpResponseHeaderSectionSize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpResponseHeaderSectionSize(" + value + ")"
    }
    object HttpResponseHeaderSectionSize {
      def apply(value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]): HttpResponseHeaderSectionSize = new HttpResponseHeaderSectionSize(value)
      def unapply(arg: HttpResponseHeaderSectionSize): Some[scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-header-size")
    final class HttpResponseHeaderSize(@scala.scalajs.wit.annotation.WitName("value") val value: FieldSizePayload) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpResponseHeaderSize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpResponseHeaderSize(" + value + ")"
    }
    object HttpResponseHeaderSize {
      def apply(value: FieldSizePayload): HttpResponseHeaderSize = new HttpResponseHeaderSize(value)
      def unapply(arg: HttpResponseHeaderSize): Some[FieldSizePayload] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-body-size")
    final class HttpResponseBodySize(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.ULong]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpResponseBodySize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpResponseBodySize(" + value + ")"
    }
    object HttpResponseBodySize {
      def apply(value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.ULong]): HttpResponseBodySize = new HttpResponseBodySize(value)
      def unapply(arg: HttpResponseBodySize): Some[scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.ULong]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-trailer-section-size")
    final class HttpResponseTrailerSectionSize(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpResponseTrailerSectionSize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpResponseTrailerSectionSize(" + value + ")"
    }
    object HttpResponseTrailerSectionSize {
      def apply(value: scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]): HttpResponseTrailerSectionSize = new HttpResponseTrailerSectionSize(value)
      def unapply(arg: HttpResponseTrailerSectionSize): Some[scala.scalajs.wit.Option[scala.scalajs.wit.unsigned.UInt]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-trailer-size")
    final class HttpResponseTrailerSize(@scala.scalajs.wit.annotation.WitName("value") val value: FieldSizePayload) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpResponseTrailerSize => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpResponseTrailerSize(" + value + ")"
    }
    object HttpResponseTrailerSize {
      def apply(value: FieldSizePayload): HttpResponseTrailerSize = new HttpResponseTrailerSize(value)
      def unapply(arg: HttpResponseTrailerSize): Some[FieldSizePayload] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-transfer-coding")
    final class HttpResponseTransferCoding(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[String]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpResponseTransferCoding => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpResponseTransferCoding(" + value + ")"
    }
    object HttpResponseTransferCoding {
      def apply(value: scala.scalajs.wit.Option[String]): HttpResponseTransferCoding = new HttpResponseTransferCoding(value)
      def unapply(arg: HttpResponseTransferCoding): Some[scala.scalajs.wit.Option[String]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-content-coding")
    final class HttpResponseContentCoding(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[String]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: HttpResponseContentCoding => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "HttpResponseContentCoding(" + value + ")"
    }
    object HttpResponseContentCoding {
      def apply(value: scala.scalajs.wit.Option[String]): HttpResponseContentCoding = new HttpResponseContentCoding(value)
      def unapply(arg: HttpResponseContentCoding): Some[scala.scalajs.wit.Option[String]] = Some(arg.value)
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-response-timeout")
    object HttpResponseTimeout extends ErrorCode {
      override def toString(): String = "HttpResponseTimeout"
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-upgrade-failed")
    object HttpUpgradeFailed extends ErrorCode {
      override def toString(): String = "HttpUpgradeFailed"
    }
    @scala.scalajs.wit.annotation.WitName("HTTP-protocol-error")
    object HttpProtocolError extends ErrorCode {
      override def toString(): String = "HttpProtocolError"
    }
    @scala.scalajs.wit.annotation.WitName("loop-detected")
    object LoopDetected extends ErrorCode {
      override def toString(): String = "LoopDetected"
    }
    @scala.scalajs.wit.annotation.WitName("configuration-error")
    object ConfigurationError extends ErrorCode {
      override def toString(): String = "ConfigurationError"
    }
    @scala.scalajs.wit.annotation.WitName("internal-error")
    final class InternalError(@scala.scalajs.wit.annotation.WitName("value") val value: scala.scalajs.wit.Option[String]) extends ErrorCode {
      override def equals(other: Any): Boolean = other match {
        case that: InternalError => this.value == that.value
        case _ => false
      }
      override def hashCode(): Int = {
        value.hashCode()
      }
      override def toString(): String = "InternalError(" + value + ")"
    }
    object InternalError {
      def apply(value: scala.scalajs.wit.Option[String]): InternalError = new InternalError(value)
      def unapply(arg: InternalError): Some[scala.scalajs.wit.Option[String]] = Some(arg.value)
    }
  }

  /** This type enumerates the different kinds of errors that may occur when
   *  setting or appending to a `fields` resource.
   */
  @scala.scalajs.wit.annotation.WitVariant(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "header-error")
  sealed trait HeaderError
  object HeaderError {
    @scala.scalajs.wit.annotation.WitName("invalid-syntax")
    object InvalidSyntax extends HeaderError {
      override def toString(): String = "InvalidSyntax"
    }
    @scala.scalajs.wit.annotation.WitName("forbidden")
    object Forbidden extends HeaderError {
      override def toString(): String = "Forbidden"
    }
    @scala.scalajs.wit.annotation.WitName("immutable")
    object Immutable extends HeaderError {
      override def toString(): String = "Immutable"
    }
  }

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "field-key")
  type FieldKey = String

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "field-name")
  type FieldName = FieldKey

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "field-value")
  type FieldValue = Array[scala.scalajs.wit.unsigned.UByte]

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "headers")
  type Headers = Fields

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "trailers")
  type Trailers = Fields

  @scala.scalajs.wit.annotation.WitAlias(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "status-code")
  type StatusCode = scala.scalajs.wit.unsigned.UShort

  // Resources
  /** This following block defines the `fields` resource which corresponds to
   *  HTTP standard Fields. Fields are a common representation used for both
   *  Headers and Trailers.
   *
   *  A `fields` may be mutable or immutable. A `fields` created using the
   *  constructor, `from-list`, or `clone` will be mutable, but a `fields`
   *  resource given by other means (including, but not limited to,
   *  `incoming-request.headers`, `outgoing-request.headers`) might be
   *  immutable. In an immutable fields, the `set`, `append`, and `delete`
   *  operations will fail with `header-error.immutable`.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "fields")
  final class Fields private () extends Object {
    /** Get all of the values corresponding to a name. If the name is not present
     *  in this `fields` or is syntactically invalid, an empty list is returned.
     *  However, if the name is present but empty, this is represented by a list
     *  with one or more empty field-values present.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("get")
    def get(@scala.scalajs.wit.annotation.WitName("name") name: FieldName): Array[Array[scala.scalajs.wit.unsigned.UByte]] = scala.scalajs.wit.native
    /** Returns `true` when the name is present in this `fields`. If the name is
     *  syntactically invalid, `false` is returned.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("has")
    def has(@scala.scalajs.wit.annotation.WitName("name") name: FieldName): Boolean = scala.scalajs.wit.native
    /** Set all of the values for a name. Clears any existing values for that
     *  name, if they have been set.
     *
     *  Fails with `header-error.immutable` if the `fields` are immutable.
     *
     *  Fails with `header-error.invalid-syntax` if the `field-name` or any of
     *  the `field-value`s are syntactically invalid.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set")
    def set(@scala.scalajs.wit.annotation.WitName("name") name: FieldName, @scala.scalajs.wit.annotation.WitName("value") value: Array[Array[scala.scalajs.wit.unsigned.UByte]]): scala.scalajs.wit.Result[Unit, HeaderError] = scala.scalajs.wit.native
    /** Delete all values for a name. Does nothing if no values for the name
     *  exist.
     *
     *  Fails with `header-error.immutable` if the `fields` are immutable.
     *
     *  Fails with `header-error.invalid-syntax` if the `field-name` is
     *  syntactically invalid.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("delete")
    def delete(@scala.scalajs.wit.annotation.WitName("name") name: FieldName): scala.scalajs.wit.Result[Unit, HeaderError] = scala.scalajs.wit.native
    /** Append a value for a name. Does not change or delete any existing
     *  values for that name.
     *
     *  Fails with `header-error.immutable` if the `fields` are immutable.
     *
     *  Fails with `header-error.invalid-syntax` if the `field-name` or
     *  `field-value` are syntactically invalid.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("append")
    def append(@scala.scalajs.wit.annotation.WitName("name") name: FieldName, @scala.scalajs.wit.annotation.WitName("value") value: Array[scala.scalajs.wit.unsigned.UByte]): scala.scalajs.wit.Result[Unit, HeaderError] = scala.scalajs.wit.native
    /** Retrieve the full set of names and values in the Fields. Like the
     *  constructor, the list represents each name-value pair.
     *
     *  The outer list represents each name-value pair in the Fields. Names
     *  which have multiple values are represented by multiple entries in this
     *  list with the same name.
     *
     *  The names and values are always returned in the original casing and in
     *  the order in which they will be serialized for transport.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("entries")
    def entries(): Array[scala.scalajs.wit.Tuple2[FieldName, Array[scala.scalajs.wit.unsigned.UByte]]] = scala.scalajs.wit.native
    /** Make a deep copy of the Fields. Equivalent in behavior to calling the
     *  `fields` constructor on the return value of `entries`. The resulting
     *  `fields` is mutable.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("clone")
    def clone_(): Fields = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object Fields {
    /** Construct an empty HTTP Fields.
     *
     *  The resulting `fields` is mutable.
     */
    @scala.scalajs.wit.annotation.WitResourceConstructor
    def apply(): Fields = scala.scalajs.wit.native
    /** Construct an HTTP Fields.
     *
     *  The resulting `fields` is mutable.
     *
     *  The list represents each name-value pair in the Fields. Names
     *  which have multiple values are represented by multiple entries in this
     *  list with the same name.
     *
     *  The tuple is a pair of the field name, represented as a string, and
     *  Value, represented as a list of bytes.
     *
     *  An error result will be returned if any `field-name` or `field-value` is
     *  syntactically invalid, or if a field is forbidden.
     */
    @scala.scalajs.wit.annotation.WitResourceStaticMethod("from-list")
    def fromList(@scala.scalajs.wit.annotation.WitName("entries") entries: Array[scala.scalajs.wit.Tuple2[FieldName, Array[scala.scalajs.wit.unsigned.UByte]]]): scala.scalajs.wit.Result[Fields, HeaderError] = scala.scalajs.wit.native
  }

  /** Represents an incoming HTTP Request.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "incoming-request")
  final class IncomingRequest private () extends Object {
    /** Returns the method of the incoming request.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("method")
    def method(): Method = scala.scalajs.wit.native
    /** Returns the path with query parameters from the request, as a string.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("path-with-query")
    def pathWithQuery(): scala.scalajs.wit.Option[String] = scala.scalajs.wit.native
    /** Returns the protocol scheme from the request.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("scheme")
    def scheme(): scala.scalajs.wit.Option[Scheme] = scala.scalajs.wit.native
    /** Returns the authority of the Request's target URI, if present.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("authority")
    def authority(): scala.scalajs.wit.Option[String] = scala.scalajs.wit.native
    /** Get the `headers` associated with the request.
     *
     *  The returned `headers` resource is immutable: `set`, `append`, and
     *  `delete` operations will fail with `header-error.immutable`.
     *
     *  The `headers` returned are a child resource: it must be dropped before
     *  the parent `incoming-request` is dropped. Dropping this
     *  `incoming-request` before all children are dropped will trap.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("headers")
    def headers(): Headers = scala.scalajs.wit.native
    /** Gives the `incoming-body` associated with this request. Will only
     *  return success at most once, and subsequent calls will return error.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("consume")
    def consume(): scala.scalajs.wit.Result[IncomingBody, Unit] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object IncomingRequest {
  }

  /** Represents an outgoing HTTP Request.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "outgoing-request")
  final class OutgoingRequest private () extends Object {
    /** Returns the resource corresponding to the outgoing Body for this
     *  Request.
     *
     *  Returns success on the first call: the `outgoing-body` resource for
     *  this `outgoing-request` can be retrieved at most once. Subsequent
     *  calls will return error.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("body")
    def body(): scala.scalajs.wit.Result[OutgoingBody, Unit] = scala.scalajs.wit.native
    /** Get the Method for the Request.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("method")
    def method(): Method = scala.scalajs.wit.native
    /** Set the Method for the Request. Fails if the string present in a
     *  `method.other` argument is not a syntactically valid method.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-method")
    def setMethod(@scala.scalajs.wit.annotation.WitName("method") method: Method): scala.scalajs.wit.Result[Unit, Unit] = scala.scalajs.wit.native
    /** Get the combination of the HTTP Path and Query for the Request.
     *  When `none`, this represents an empty Path and empty Query.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("path-with-query")
    def pathWithQuery(): scala.scalajs.wit.Option[String] = scala.scalajs.wit.native
    /** Set the combination of the HTTP Path and Query for the Request.
     *  When `none`, this represents an empty Path and empty Query. Fails is the
     *  string given is not a syntactically valid path and query uri component.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-path-with-query")
    def setPathWithQuery(@scala.scalajs.wit.annotation.WitName("path-with-query") pathWithQuery: scala.scalajs.wit.Option[String]): scala.scalajs.wit.Result[Unit, Unit] = scala.scalajs.wit.native
    /** Get the HTTP Related Scheme for the Request. When `none`, the
     *  implementation may choose an appropriate default scheme.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("scheme")
    def scheme(): scala.scalajs.wit.Option[Scheme] = scala.scalajs.wit.native
    /** Set the HTTP Related Scheme for the Request. When `none`, the
     *  implementation may choose an appropriate default scheme. Fails if the
     *  string given is not a syntactically valid uri scheme.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-scheme")
    def setScheme(@scala.scalajs.wit.annotation.WitName("scheme") scheme: scala.scalajs.wit.Option[Scheme]): scala.scalajs.wit.Result[Unit, Unit] = scala.scalajs.wit.native
    /** Get the authority of the Request's target URI. A value of `none` may be used
     *  with Related Schemes which do not require an authority. The HTTP and
     *  HTTPS schemes always require an authority.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("authority")
    def authority(): scala.scalajs.wit.Option[String] = scala.scalajs.wit.native
    /** Set the authority of the Request's target URI. A value of `none` may be used
     *  with Related Schemes which do not require an authority. The HTTP and
     *  HTTPS schemes always require an authority. Fails if the string given is
     *  not a syntactically valid URI authority.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-authority")
    def setAuthority(@scala.scalajs.wit.annotation.WitName("authority") authority: scala.scalajs.wit.Option[String]): scala.scalajs.wit.Result[Unit, Unit] = scala.scalajs.wit.native
    /** Get the headers associated with the Request.
     *
     *  The returned `headers` resource is immutable: `set`, `append`, and
     *  `delete` operations will fail with `header-error.immutable`.
     *
     *  This headers resource is a child: it must be dropped before the parent
     *  `outgoing-request` is dropped, or its ownership is transferred to
     *  another component by e.g. `outgoing-handler.handle`.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("headers")
    def headers(): Headers = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object OutgoingRequest {
    /** Construct a new `outgoing-request` with a default `method` of `GET`, and
     *  `none` values for `path-with-query`, `scheme`, and `authority`.
     *
     *  * `headers` is the HTTP Headers for the Request.
     *
     *  It is possible to construct, or manipulate with the accessor functions
     *  below, an `outgoing-request` with an invalid combination of `scheme`
     *  and `authority`, or `headers` which are not permitted to be sent.
     *  It is the obligation of the `outgoing-handler.handle` implementation
     *  to reject invalid constructions of `outgoing-request`.
     */
    @scala.scalajs.wit.annotation.WitResourceConstructor
    def apply(@scala.scalajs.wit.annotation.WitName("headers") headers: Headers): OutgoingRequest = scala.scalajs.wit.native
  }

  /** Parameters for making an HTTP Request. Each of these parameters is
   *  currently an optional timeout applicable to the transport layer of the
   *  HTTP protocol.
   *
   *  These timeouts are separate from any the user may use to bound a
   *  blocking call to `wasi:io/poll.poll`.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "request-options")
  final class RequestOptions private () extends Object {
    /** The timeout for the initial connect to the HTTP Server.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("connect-timeout")
    def connectTimeout(): scala.scalajs.wit.Option[Duration] = scala.scalajs.wit.native
    /** Set the timeout for the initial connect to the HTTP Server. An error
     *  return value indicates that this timeout is not supported.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-connect-timeout")
    def setConnectTimeout(@scala.scalajs.wit.annotation.WitName("duration") duration: scala.scalajs.wit.Option[Duration]): scala.scalajs.wit.Result[Unit, Unit] = scala.scalajs.wit.native
    /** The timeout for receiving the first byte of the Response body.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("first-byte-timeout")
    def firstByteTimeout(): scala.scalajs.wit.Option[Duration] = scala.scalajs.wit.native
    /** Set the timeout for receiving the first byte of the Response body. An
     *  error return value indicates that this timeout is not supported.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-first-byte-timeout")
    def setFirstByteTimeout(@scala.scalajs.wit.annotation.WitName("duration") duration: scala.scalajs.wit.Option[Duration]): scala.scalajs.wit.Result[Unit, Unit] = scala.scalajs.wit.native
    /** The timeout for receiving subsequent chunks of bytes in the Response
     *  body stream.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("between-bytes-timeout")
    def betweenBytesTimeout(): scala.scalajs.wit.Option[Duration] = scala.scalajs.wit.native
    /** Set the timeout for receiving subsequent chunks of bytes in the Response
     *  body stream. An error return value indicates that this timeout is not
     *  supported.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-between-bytes-timeout")
    def setBetweenBytesTimeout(@scala.scalajs.wit.annotation.WitName("duration") duration: scala.scalajs.wit.Option[Duration]): scala.scalajs.wit.Result[Unit, Unit] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object RequestOptions {
    /** Construct a default `request-options` value.
     */
    @scala.scalajs.wit.annotation.WitResourceConstructor
    def apply(): RequestOptions = scala.scalajs.wit.native
  }

  /** Represents the ability to send an HTTP Response.
   *
   *  This resource is used by the `wasi:http/incoming-handler` interface to
   *  allow a Response to be sent corresponding to the Request provided as the
   *  other argument to `incoming-handler.handle`.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "response-outparam")
  final class ResponseOutparam private () extends Object {
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object ResponseOutparam {
    /** Set the value of the `response-outparam` to either send a response,
     *  or indicate an error.
     *
     *  This method consumes the `response-outparam` to ensure that it is
     *  called at most once. If it is never called, the implementation
     *  will respond with an error.
     *
     *  The user may provide an `error` to `response` to allow the
     *  implementation determine how to respond with an HTTP error response.
     */
    @scala.scalajs.wit.annotation.WitResourceStaticMethod("set")
    def set(@scala.scalajs.wit.annotation.WitName("param") param: ResponseOutparam, @scala.scalajs.wit.annotation.WitName("response") response: scala.scalajs.wit.Result[OutgoingResponse, ErrorCode]): Unit = scala.scalajs.wit.native
  }

  /** Represents an incoming HTTP Response.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "incoming-response")
  final class IncomingResponse private () extends Object {
    /** Returns the status code from the incoming response.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("status")
    def status(): StatusCode = scala.scalajs.wit.native
    /** Returns the headers from the incoming response.
     *
     *  The returned `headers` resource is immutable: `set`, `append`, and
     *  `delete` operations will fail with `header-error.immutable`.
     *
     *  This headers resource is a child: it must be dropped before the parent
     *  `incoming-response` is dropped.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("headers")
    def headers(): Headers = scala.scalajs.wit.native
    /** Returns the incoming body. May be called at most once. Returns error
     *  if called additional times.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("consume")
    def consume(): scala.scalajs.wit.Result[IncomingBody, Unit] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object IncomingResponse {
  }

  /** Represents an incoming HTTP Request or Response's Body.
   *
   *  A body has both its contents - a stream of bytes - and a (possibly
   *  empty) set of trailers, indicating that the full contents of the
   *  body have been received. This resource represents the contents as
   *  an `input-stream` and the delivery of trailers as a `future-trailers`,
   *  and ensures that the user of this interface may only be consuming either
   *  the body contents or waiting on trailers at any given time.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "incoming-body")
  final class IncomingBody private () extends Object {
    /** Returns the contents of the body, as a stream of bytes.
     *
     *  Returns success on first call: the stream representing the contents
     *  can be retrieved at most once. Subsequent calls will return error.
     *
     *  The returned `input-stream` resource is a child: it must be dropped
     *  before the parent `incoming-body` is dropped, or consumed by
     *  `incoming-body.finish`.
     *
     *  This invariant ensures that the implementation can determine whether
     *  the user is consuming the contents of the body, waiting on the
     *  `future-trailers` to be ready, or neither. This allows for network
     *  backpressure is to be applied when the user is consuming the body,
     *  and for that backpressure to not inhibit delivery of the trailers if
     *  the user does not read the entire body.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("stream")
    def stream(): scala.scalajs.wit.Result[InputStream, Unit] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object IncomingBody {
    /** Takes ownership of `incoming-body`, and returns a `future-trailers`.
     *  This function will trap if the `input-stream` child is still alive.
     */
    @scala.scalajs.wit.annotation.WitResourceStaticMethod("finish")
    def finish(@scala.scalajs.wit.annotation.WitName("this") `this`: IncomingBody): FutureTrailers = scala.scalajs.wit.native
  }

  /** Represents a future which may eventually return trailers, or an error.
   *
   *  In the case that the incoming HTTP Request or Response did not have any
   *  trailers, this future will resolve to the empty set of trailers once the
   *  complete Request or Response body has been received.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "future-trailers")
  final class FutureTrailers private () extends Object {
    /** Returns a pollable which becomes ready when either the trailers have
     *  been received, or an error has occurred. When this pollable is ready,
     *  the `get` method will return `some`.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("subscribe")
    def subscribe(): Pollable = scala.scalajs.wit.native
    /** Returns the contents of the trailers, or an error which occurred,
     *  once the future is ready.
     *
     *  The outer `option` represents future readiness. Users can wait on this
     *  `option` to become `some` using the `subscribe` method.
     *
     *  The outer `result` is used to retrieve the trailers or error at most
     *  once. It will be success on the first call in which the outer option
     *  is `some`, and error on subsequent calls.
     *
     *  The inner `result` represents that either the HTTP Request or Response
     *  body, as well as any trailers, were received successfully, or that an
     *  error occurred receiving them. The optional `trailers` indicates whether
     *  or not trailers were present in the body.
     *
     *  When some `trailers` are returned by this method, the `trailers`
     *  resource is immutable, and a child. Use of the `set`, `append`, or
     *  `delete` methods will return an error, and the resource must be
     *  dropped before the parent `future-trailers` is dropped.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("get")
    def get(): scala.scalajs.wit.Option[scala.scalajs.wit.Result[scala.scalajs.wit.Result[scala.scalajs.wit.Option[Trailers], ErrorCode], Unit]] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object FutureTrailers {
  }

  /** Represents an outgoing HTTP Response.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "outgoing-response")
  final class OutgoingResponse private () extends Object {
    /** Get the HTTP Status Code for the Response.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("status-code")
    def statusCode(): StatusCode = scala.scalajs.wit.native
    /** Set the HTTP Status Code for the Response. Fails if the status-code
     *  given is not a valid http status code.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("set-status-code")
    def setStatusCode(@scala.scalajs.wit.annotation.WitName("status-code") statusCode: StatusCode): scala.scalajs.wit.Result[Unit, Unit] = scala.scalajs.wit.native
    /** Get the headers associated with the Request.
     *
     *  The returned `headers` resource is immutable: `set`, `append`, and
     *  `delete` operations will fail with `header-error.immutable`.
     *
     *  This headers resource is a child: it must be dropped before the parent
     *  `outgoing-request` is dropped, or its ownership is transferred to
     *  another component by e.g. `outgoing-handler.handle`.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("headers")
    def headers(): Headers = scala.scalajs.wit.native
    /** Returns the resource corresponding to the outgoing Body for this Response.
     *
     *  Returns success on the first call: the `outgoing-body` resource for
     *  this `outgoing-response` can be retrieved at most once. Subsequent
     *  calls will return error.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("body")
    def body(): scala.scalajs.wit.Result[OutgoingBody, Unit] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object OutgoingResponse {
    /** Construct an `outgoing-response`, with a default `status-code` of `200`.
     *  If a different `status-code` is needed, it must be set via the
     *  `set-status-code` method.
     *
     *  * `headers` is the HTTP Headers for the Response.
     */
    @scala.scalajs.wit.annotation.WitResourceConstructor
    def apply(@scala.scalajs.wit.annotation.WitName("headers") headers: Headers): OutgoingResponse = scala.scalajs.wit.native
  }

  /** Represents an outgoing HTTP Request or Response's Body.
   *
   *  A body has both its contents - a stream of bytes - and a (possibly
   *  empty) set of trailers, inducating the full contents of the body
   *  have been sent. This resource represents the contents as an
   *  `output-stream` child resource, and the completion of the body (with
   *  optional trailers) with a static function that consumes the
   *  `outgoing-body` resource, and ensures that the user of this interface
   *  may not write to the body contents after the body has been finished.
   *
   *  If the user code drops this resource, as opposed to calling the static
   *  method `finish`, the implementation should treat the body as incomplete,
   *  and that an error has occurred. The implementation should propagate this
   *  error to the HTTP protocol by whatever means it has available,
   *  including: corrupting the body on the wire, aborting the associated
   *  Request, or sending a late status code for the Response.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "outgoing-body")
  final class OutgoingBody private () extends Object {
    /** Returns a stream for writing the body contents.
     *
     *  The returned `output-stream` is a child resource: it must be dropped
     *  before the parent `outgoing-body` resource is dropped (or finished),
     *  otherwise the `outgoing-body` drop or `finish` will trap.
     *
     *  Returns success on the first call: the `output-stream` resource for
     *  this `outgoing-body` may be retrieved at most once. Subsequent calls
     *  will return error.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("write")
    def write(): scala.scalajs.wit.Result[OutputStream, Unit] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object OutgoingBody {
    /** Finalize an outgoing body, optionally providing trailers. This must be
     *  called to signal that the response is complete. If the `outgoing-body`
     *  is dropped without calling `outgoing-body.finalize`, the implementation
     *  should treat the body as corrupted.
     *
     *  Fails if the body's `outgoing-request` or `outgoing-response` was
     *  constructed with a Content-Length header, and the contents written
     *  to the body (via `write`) does not match the value given in the
     *  Content-Length.
     */
    @scala.scalajs.wit.annotation.WitResourceStaticMethod("finish")
    def finish(@scala.scalajs.wit.annotation.WitName("this") `this`: OutgoingBody, @scala.scalajs.wit.annotation.WitName("trailers") trailers: scala.scalajs.wit.Option[Trailers]): scala.scalajs.wit.Result[Unit, ErrorCode] = scala.scalajs.wit.native
  }

  /** Represents a future which may eventually return an incoming HTTP
   *  Response, or an error.
   *
   *  This resource is returned by the `wasi:http/outgoing-handler` interface to
   *  provide the HTTP Response corresponding to the sent Request.
   */
  @scala.scalajs.wit.annotation.WitResourceImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "future-incoming-response")
  final class FutureIncomingResponse private () extends Object {
    /** Returns a pollable which becomes ready when either the Response has
     *  been received, or an error has occurred. When this pollable is ready,
     *  the `get` method will return `some`.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("subscribe")
    def subscribe(): Pollable = scala.scalajs.wit.native
    /** Returns the incoming HTTP Response, or an error, once one is ready.
     *
     *  The outer `option` represents future readiness. Users can wait on this
     *  `option` to become `some` using the `subscribe` method.
     *
     *  The outer `result` is used to retrieve the response or error at most
     *  once. It will be success on the first call in which the outer option
     *  is `some`, and error on subsequent calls.
     *
     *  The inner `result` represents that either the incoming HTTP Response
     *  status and headers have received successfully, or that an error
     *  occurred. Errors may also occur while consuming the response body,
     *  but those will be reported by the `incoming-body` and its
     *  `output-stream` child.
     */
    @scala.scalajs.wit.annotation.WitResourceMethod("get")
    def get(): scala.scalajs.wit.Option[scala.scalajs.wit.Result[scala.scalajs.wit.Result[IncomingResponse, ErrorCode], Unit]] = scala.scalajs.wit.native
    @scala.scalajs.wit.annotation.WitResourceDrop
    def close(): Unit = scala.scalajs.wit.native
  }
  object FutureIncomingResponse {
  }

  // Functions
  /** Attempts to extract a http-related `error` from the wasi:io `error`
   *  provided.
   *
   *  Stream operations which return
   *  `wasi:io/stream.stream-error.last-operation-failed` have a payload of
   *  type `wasi:io/error.error` with more information about the operation
   *  that failed. This payload can be passed through to this function to see
   *  if there's http-related information about the error to return.
   *
   *  Note that this function is fallible because not all io-errors are
   *  http-related errors.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "http", "types", "0.2.12"), "http-error-code")
  def httpErrorCode(@scala.scalajs.wit.annotation.WitName("err") err: scala.scalajs.wit.Borrow[IoError]): scala.scalajs.wit.Option[ErrorCode] = scala.scalajs.wit.native

}
