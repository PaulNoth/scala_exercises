// exists will determine if a predicate is valid for some members of a *Traversable*.

val list = List(87, 44, 5, 4, 200, 10, 39, 100)
val result = list exists (_ < 100)
result should be(true)