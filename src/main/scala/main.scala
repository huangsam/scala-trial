import behavior.Human

@main
def main(): Unit = {
  // Basic I/O
  println("Hello world!")

  // For loop with range
  for (i <- 1 to 10) {
    println(fibonacci(i))
  }

  // Java interoperability
  val human = new Human()
  human.talk()

  // Functional paradigms
  val numbers = List(1.0, 2.0, 3.0, 4.0, 5.0)
  val total = totalSum(numbers)
  println(s"Sum of ${numbers.mkString(" + ")} = $total")
}
