package io.github.scalawasm.wasi4s.wasi.filesystem

package object preopens {

  // Type definitions
  type Descriptor = io.github.scalawasm.wasi4s.wasi.filesystem.types.Descriptor

  // Functions
  /** Return the set of preopened directories, and their paths.
   */
  @scala.scalajs.wit.annotation.WitImport(scala.scalajs.wit.annotation.WitScope("wasi", "filesystem", "preopens", "0.2.12"), "get-directories")
  def getDirectories(): Array[scala.scalajs.wit.Tuple2[Descriptor, String]] = scala.scalajs.wit.native

}
