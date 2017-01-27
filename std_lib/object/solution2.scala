object Greeting {
  def english = "Hi"

  def espanol = "Hola"

  def deutsch = "Hallo"

  def magyar = "Szia"
}

val x = Greeting
val y = x

x eq y should be(true) //Reminder: eq checks for reference

val z = Greeting
x eq z should be(true)