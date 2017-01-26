// fold - this operation will extract the value from the option, or provide a default if the value is None

val number: Option[Int] = Some(3)
val noNumber: Option[Int] = None
val result1 = number.fold(0)(_ * 3)
val result2 = noNumber.fold(0)(_ * 3)

result1 should be(9)
result2 should be(0)
