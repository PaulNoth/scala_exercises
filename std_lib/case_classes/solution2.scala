// Case classes have an automatic hashcode method that works:

case class Person(first: String, last: String)

val p1 = new Person("Fred", "Jones")
val p2 = new Person("Shaggy", "Rogers")
val p3 = new Person("Fred", "Jones")

(p1.hashCode == p2.hashCode) should be(false)
(p1.hashCode == p3.hashCode) should be(true)