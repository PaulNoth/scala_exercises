// A list can be converted to an array:

val l = List(1, 2, 3)
val a = l.toArray
a should equal(Array(1, 2, 3))