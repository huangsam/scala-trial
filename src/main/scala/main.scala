@main
def main(): Unit = {
  println("Hello world!")

  for (i <- 1 to 10) {
    println(fibonacci(i))
  }
}

def fibonacci(n: Int): Int = {
  if (n < 1) {
    throw new IllegalArgumentException(s"Invalid input here ${n}");
  } else if (n < 3) {
    return n;
  }
  fibonacci(n - 1) + fibonacci(n - 2)
}
