// Case classes can be disassembled to their constituent parts as a tuple:

case class Person(first: String, last: String, age: Int = 0, ssn: String = "")
val p1 = Person("Fred", "Jones", 23, "111-22-3333")

val parts = Person.unapply(p1).get // this seems weird, but it's critical to other features of Scala

parts._1 should be("Fred")
parts._2 should be("Jones")
parts._3 should be(23)
parts._4 should be("111-22-3333")