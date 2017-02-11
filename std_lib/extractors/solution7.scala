// What is typical is to create a custom extractor in the companion object of the class.
// In this exercise, we use it as an assignment:

class Employee(val firstName: String, val middleName: Option[String], val lastName: String)

object Employee {
  //factory methods, extractors, apply
  //Extractor: Create tokens that represent your object
  def unapply(x: Employee) =
  Some(x.lastName, x.middleName, x.firstName)
}

val singri = new Employee("Singri", None, "Keerthi")

val Employee(a, b, c) = singri

a should be("Keerthi")
b should be(None)
c should be("Singri")