package io.github.scalawasm.wasi4s

import io.github.scalawasm.wasi4s.wasi.clocks.monotonic_clock._
import io.github.scalawasm.wasi4s.wasi.cli.environment._
import io.github.scalawasm.wasi4s.wasi.cli.stdout._
import io.github.scalawasm.wasi4s.wasi.random.random._
import org.junit.Assert._
import org.junit.Test
import scala.scalajs.wit.unsigned._

class WasiBindingsTest {
  @Test
  def randomBytesHaveRequestedLength(): Unit = {
    val bytes = getRandomBytes(16L)
    assertEquals(16, bytes.length)
  }

  @Test
  def monotonicClockIsNonDecreasing(): Unit = {
    val t1 = now()
    val t2 = now()
    assertTrue(t2 >= t1)
  }

  @Test
  def canWriteToStdout(): Unit = {
    val out = getStdout()
    val result =
      out.blockingWriteAndFlush("wasi4s test\n".getBytes().asInstanceOf[Array[UByte]])
    assertTrue(result.isOk)
    out.close()
  }

  @Test
  def environmentIsReadable(): Unit = {
    val env = getEnvironment()
    assertNotNull(env)
  }
}
