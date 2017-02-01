// Case classes have an automatic equals method that works:

case class Person(first: String, last: String)

val p1 = new Person("Fred", "Jones")
val p2 = new Person("Shaggy", "Rogers")
val p3 = new Person("Fred", "Jones")

(p1 == p2) should be(false)
(p1 == p3) should be(true)

(p1 eq p2) should be(false)
(p1 eq p3) should be(false)