// an option could be looked at as a collection with either one or zero elements.

val number: Option[Int] = Some(3)
val noNumber: Option[Int] = None
val result1 = number.map(_ * 1.5)
val result2 = noNumber.map(_ * 1.5)

result1 should be(Option(4.5))
result2 should be(None)
