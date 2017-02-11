// As long as the method signatures aren't the same, you can have as many unapply methods as you want:

class Car(val make: String, val model: String, val year: Short, val topSpeed: Short)
class Employee(val firstName: String, val middleName: Option[String], val lastName: String)

object Tokenizer {
  def unapply(x: Car) = Some(x.make, x.model, x.year, x.topSpeed)
  def unapply(x: Employee) = Some(x.firstName, x.lastName)
}

val result = new Employee("Kurt", None, "Vonnegut") match {
  case Tokenizer(c, d) => "c: %s, d: %s".format(c, d)
  case _ => "Not found"
}

result should be("c: Kurt, d: Vonnegut")