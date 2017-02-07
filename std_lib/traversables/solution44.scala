// count will count the number of elements that satisfy a predicate in a *Traversable*.

val list = List(87, 44, 5, 4, 200, 10, 39, 100)
val result = list count (_ < 100)
result should be(6)