// Case classes have a convenient toString method defined:

case class Dog(name: String, breed: String)
val d1 = Dog("Scooby", "Doberman")
d1.toString should be("Dog(Scooby,Doberman)")