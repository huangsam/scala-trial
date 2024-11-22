def fibonacci(n: Int): Int = {
  if (n < 1) {
    throw new IllegalArgumentException(s"Invalid input here $n")
  } else if (n < 3) {
    return n
  }
  fibonacci(n - 1) + fibonacci(n - 2)
}

def totalSum(numbers: List[Double]): Double = {
  numbers.foldLeft(0.0)(_ + _)
}
