// reduceLeft is the similar to *foldLeft*, except that the seed is the head value

val intList = List(5, 4, 3, 2, 1)
intList.reduceLeft {
  _ + _
} should be(15)

val stringList = List("Do", "Re", "Me", "Fa", "So", "La", "Te", "Do")
stringList.reduceLeft {
  _ + _
} should be("DoReMeFaSoLaTeDo")