// Traits are polymorphic. Any type can be referred to by another type if
// related by extension:

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

val myListener = new MyListener

myListener.isInstanceOf[MyListener] should be(true)
myListener.isInstanceOf[EventListener] should be(true)
myListener.isInstanceOf[Any] should be(true)
myListener.isInstanceOf[AnyRef] should be(true)