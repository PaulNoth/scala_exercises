// Of course an extractor can be used in pattern matching...

class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)

object ChopShop {
  def unapply(x: Car) = Some(x.make, x.model, x.year, x.topSpeed)
}

val x = new Car("Chevy", "Camaro", 1978, 120) match {
  case ChopShop(s, t, u, v) => (s, t)
  case _ => ("Ford", "Edsel")
}

x._1 should be("Chevy")
x._2 should be("Camaro")