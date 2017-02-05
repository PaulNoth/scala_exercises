// A class can only extend from one class or trait,
// any subsequent extension should use the keyword with:

case class Event(name: String)

trait EventListener {
  def listen(event: Event): String
}

class OurListener

class MyListener extends OurListener with EventListener {
  def listen(event: Event): String = {
    event match {
      case Event("Woodchuck Stampede") ⇒ "An unfortunate woodchuck stampede occurred"
      case _ => "Nothing of importance occurred"
    }
  }
}

val evt = Event("Woodchuck Stampede")
val myListener = new MyListener
myListener.listen(evt) should be(
  "An unfortunate woodchuck stampede occurred"
)