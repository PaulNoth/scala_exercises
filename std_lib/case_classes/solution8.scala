// Case classes can have default and named parameters:

case class Person(first: String, last: String, age: Int = 0, ssn: String = "")
val p1 = Person("Fred", "Jones", 23, "111-22-3333")
val p2 = Person("Samantha", "Jones") // note missing age and ssn
val p3 = Person(last = "Jones", first = "Fred", ssn = "111-22-3333") // note the order can change, and missing age
val p4 = p3.copy(age = 23)

p1.first should be("Fred")
p1.last should be("Jones")
p1.age should be(23)
p1.ssn should be("111-22-3333")

p2.first should be("Samantha")
p2.last should be("Jones")
p2.age should be(0)
p2.ssn should be("")

p3.first should be("Fred")
p3.last should be("Jones")
p3.age should be(0)
p3.ssn should be("111-22-3333")

(p1 == p4) should be(true)