// You can create a sequence from a for comprehension:

val s = for (v <- 1 to 4) yield v
s.toList should be(List(1, 2, 3, 4))