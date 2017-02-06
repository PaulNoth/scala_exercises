// Any sequence can be converted to a list:

val a = Array(1, 2, 3)
val s = a.toSeq
val l = s.toList
l should equal(List(1, 2, 3))