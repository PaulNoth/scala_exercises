// In this exercise we use the unapply for pattern matching employee objects

class Employee(val firstName: String, val middleName: Option[String], val lastName: String)

object Employee {
  //factory methods, extractors, apply
  //Extractor: Create tokens that represent your object
  def unapply(x: Employee) =
  Some(x.lastName, x.middleName, x.firstName)
}

val singri = new Employee("Singri", None, "Keerthi")

val result = singri match {
  case Employee("Singri", None, x) => "Yay, Singri %s! with no middle name!".format(x)
  case Employee("Singri", Some(x), _) => "Yay, Singri with a middle name of %s".format(x)
  case _ => "I don't care, going on break"
}

result should be("I don't care, going on break")