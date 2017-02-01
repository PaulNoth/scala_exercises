// Case classes can have mutable properties:

case class Dog(var name: String, breed: String) // you can rename a dog, but change its breed? nah!
val d1 = Dog("Scooby", "Doberman")

d1.name should be("Scooby")
d1.breed should be("Doberman")

d1.name = "Scooby Doo" // but is it a good idea?

d1.name should be("Scooby Doo")
d1.breed should be("Doberman")