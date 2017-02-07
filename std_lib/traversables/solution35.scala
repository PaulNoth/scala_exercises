// dropWhile will continually drop elements until a predicate is no longer satisfied.

val list = List(87, 44, 5, 4, 200, 10, 39, 100)
list.dropWhile(_ < 100) should be(List(200, 10, 39, 100))