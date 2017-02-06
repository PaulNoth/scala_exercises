// You can create a sequence from a for comprehension with a condition:

val s = for (v <- 1 to 10 if v % 3 == 0) yield v
s.toList should be(List(3, 6, 9))