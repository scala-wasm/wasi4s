package io.github.scalawasm.wasi4s.wasi.random

package object insecure {

  // Functions
  /** Return `len` insecure pseudo-random bytes.
   *
   *  This function is not cryptographically secure. Do not use it for
   *  anything related to security.
   *
   *  There are no requirements on the values of the returned bytes, however
   *  implementations are encouraged to return evenly distributed values with
   *  a long period.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "random", "insecure", "0.2.12"), "get-insecure-random-bytes")
  def getInsecureRandomBytes(@scala.scalajs.wit.annotation.WitName("len") len: scala.scalajs.wit.unsigned.ULong): Array[scala.scalajs.wit.unsigned.UByte] = scala.scalajs.wit.native

  /** Return an insecure pseudo-random `u64` value.
   *
   *  This function returns the same type of pseudo-random data as
   *  `get-insecure-random-bytes`, represented as a `u64`.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "random", "insecure", "0.2.12"), "get-insecure-random-u64")
  def getInsecureRandomU64(): scala.scalajs.wit.unsigned.ULong = scala.scalajs.wit.native

}
