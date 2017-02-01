// Case classes can be created in a convenient way:

case class Dog(name: String, breed: String)

val d1 = Dog("Scooby", "Doberman")
val d2 = Dog("Rex", "Custom")
val d3 = new Dog("Scooby", "Doberman") // the old way of creating using new

(d1 == d3) should be(true)
(d1 == d2) should be(false)
(d2 == d3) should be(false)