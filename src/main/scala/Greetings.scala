object Greetings {
  trait Formatter { def format(s: String): String }
  object EnglishFormatter extends Formatter { def format(s: String): String = s"Hello $s" }
  object GermanFormatter extends Formatter { def format(s: String): String = s"Hallo $s" }
  object JapaneseFormatter extends Formatter { def format(s: String): String =  s"こんにちは $s" }

  def sayHello(name: String, formatter: Formatter): Unit = {
    println(formatter.format(name))
  }
}
