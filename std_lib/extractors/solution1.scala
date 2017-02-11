// When you create a case class, it automatically can be used with pattern matching since it has an extractor:

case class Employee(firstName: String, lastName: String)

val rob = new Employee("Robin", "Williams")
val result = rob match {
  case Employee("Robin", _) => "Where's Batman?"
  case _ => "No Batman Joke For You"
}

result should be("Where's Batman?")