// What's an extractor? In Scala it's a method in any object called unapply, and that method is used to disassemble
// the object given by returning a tuple wrapped in an option. Extractors can be used to assign values:

class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)

object ChopShop {
  def unapply(x: Car) = Some(x.make, x.model, x.year, x.topSpeed)
}

val ChopShop(a, b, c, d) = new Car("Chevy", "Camaro", 1978, 120)

a should be("Chevy")
b should be("Camaro")
c should be(1978)
d should be(120)