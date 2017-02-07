// addString will take a StringBuilder to add the contents of list into the builder.

val stringBuilder = new StringBuilder()
val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
stringBuilder.append("I want all numbers 6-12: ")
list.filter(it => it > 5 && it < 13).addString(stringBuilder, ",")
stringBuilder.mkString should be("I want all numbers 6-12: 6,7,8,9,10,11,12")