import org.scalatest.funsuite.AnyFunSuite

class TotalSumTest extends AnyFunSuite {
  test("should calculate the total sum of an empty list") {
    val numbers = List.empty[Double]
    assert(totalSum(numbers) == 0.0)
  }

  test("should calculate the total sum of a single-element list") {
    val numbers = List(5.0)
    assert(totalSum(numbers) == 5.0)
  }

  test("should calculate the total sum of a multiple-element list") {
    val numbers = List(1.0, 2.0, 3.0, 4.0, 5.0)
    assert(totalSum(numbers) == 15.0)
  }

  test("should handle negative numbers") {
    val numbers = List(-1.0, 2.0, -3.0, 4.0)
    assert(totalSum(numbers) == 2.0)
  }
}
