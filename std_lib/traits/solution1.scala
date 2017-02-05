// A class uses the extends keyword to mixin a trait if it is the only relationship
// the class inherits:

case class Event(name: String)

trait EventListener {
  def listen(event: Event): String
}

class MyListener extends EventListener {
  def listen(event: Event): String = {
    event match {
      case Event("Moose Stampede") ⇒ "An unfortunate moose stampede occurred"
      case _ => "Nothing of importance occurred"
    }
  }
}

val evt = Event("Moose Stampede")
val myListener = new MyListener
myListener.listen(evt) should be(
  "An unfortunate moose stampede occurred"
)