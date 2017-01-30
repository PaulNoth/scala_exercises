// Lists can be accessed by position

val a = List(1, 3, 5, 7, 9)
a(0) should equal(1)
a(2) should equal(5)
a(4) should equal(9)

intercept[IndexOutOfBoundsException] {
  println(a(5))
}