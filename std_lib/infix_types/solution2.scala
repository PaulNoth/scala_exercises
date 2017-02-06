// Of course we can make this a bit more elegant by creating an infix operator method to use
// with our infix type:

case class Person(name: String) {
  def loves(person: Person) = new Loves(this, person)
}

class Loves[A, B](val a: A, val b: B)

def announceCouple(couple: Person Loves Person) = {
  //Notice our type: Person loves Person!
  couple.a.name + " is in love with " + couple.b.name
}

val romeo = new Person("Romeo")
val juliet = new Person("Juliet")

announceCouple(romeo loves juliet) should be(
  "Romeo is in love with Juliet"
)