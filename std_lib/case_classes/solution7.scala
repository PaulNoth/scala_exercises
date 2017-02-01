// There are safer alternatives for altering case classes:

case class Dog(name: String, breed: String) // Doberman

val d1 = Dog("Scooby", "Doberman")

val d2 = d1.copy(name = "Scooby Doo") // copy the case class but change the name in the copy

d1.name should be("Scooby") // original left alone
d1.breed should be("Doberman")

d2.name should be("Scooby Doo")
d2.breed should be("Doberman")