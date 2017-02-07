// reduceRight is the similar to *foldRight*, except that the seed is the last value

val intList = List(5, 4, 3, 2, 1)
intList.reduceRight {
  _ + _
} should be(15)

val stringList = List("Do", "Re", "Me", "Fa", "So", "La", "Te", "Do")
stringList.reduceRight {
  _ + _
} should be("DoReMeFaSoLaTeDo")