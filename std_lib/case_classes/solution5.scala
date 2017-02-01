// Case classes have automatic properties:

case class Dog(name: String, breed: String)

val d1 = Dog("Scooby", "Doberman")
d1.name should be("Scooby")
d1.breed should be("Doberman")