package io.huangsam.trial

import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite {
  test("should throw IllegalArgumentException for negative input") {
    assertThrows[IllegalArgumentException] {
      fibonacci(-1)
    }
  }

  test("should return 1 for n = 1") {
    assert(fibonacci(1) === 1)
  }

  test("should return 2 for n = 2") {
    assert(fibonacci(2) === 2)
  }

  test("should calculate Fibonacci numbers correctly") {
    assert(fibonacci(3) === 3)
    assert(fibonacci(4) === 5)
    assert(fibonacci(5) === 8)
  }
}
