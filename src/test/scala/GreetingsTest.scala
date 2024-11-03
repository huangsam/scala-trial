import org.scalamock.scalatest.MockFactory
import org.scalatest.funsuite.AnyFunSuite

class GreetingsTest extends AnyFunSuite with MockFactory {
  test("sayHello") {
    val mockFormatter = mock[Greetings.Formatter]

    (mockFormatter.format).expects("Mr Bond").returning("Ah, Mr Bond. I've been expecting you").once()

    Greetings.sayHello("Mr Bond", mockFormatter)
  }
}
