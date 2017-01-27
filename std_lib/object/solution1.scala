//An object is a singleton. One object, that's it.
// This object is a replacement of static in Java, and is called upon much in the same way.

object Greeting {
  def english = "Hi"

  def espanol = "Hola"

  def deutsch = "Hallo"

  def magyar = "Szia"
}

Greeting.english should be("Hi")
Greeting.espanol should be("Hola")
Greeting.deutsch should be("Hallo")
Greeting.magyar should be("Szia")