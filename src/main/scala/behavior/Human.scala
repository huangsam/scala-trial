package behavior

class Human extends Talking {
  override def talk(): Unit = {
    println("I am a human. What about you?")
  }
}
