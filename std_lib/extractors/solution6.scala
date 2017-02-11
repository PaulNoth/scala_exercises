// An extractor can be any stable object, including instantiated classes with an unapply method.

class Car(val make: String, val model: String, val year: Short, val topSpeed: Short) {
  def unapply(x: Car) = Some(x.make, x.model)
}

val camaro = new Car("Chevy", "Camaro", 1978, 122)

val result = camaro match {
  case camaro(make, model) => "make: %s, model: %s".format(make, model)
  case _ ⇒ "unknown"
}

result should be("make: Chevy, model: Camaro")