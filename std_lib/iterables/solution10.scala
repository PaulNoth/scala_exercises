// zipWithIndex will zip an Iterable with its integer index

val xs = List("Manny", "Moe", "Jack")
xs.zipWithIndex should be(List(("Manny", 0), ("Moe", 1), ("Jack", 2)))