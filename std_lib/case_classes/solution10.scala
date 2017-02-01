// Case classes are Serializable

case class PersonCC(firstName: String, lastName: String)
val indy = PersonCC("Indiana", "Jones")

indy.isInstanceOf[Serializable] should be(true)

class Person(firstName: String, lastName: String)
val junior = new Person("Indiana", "Jones")

junior.isInstanceOf[Serializable] should be(false)