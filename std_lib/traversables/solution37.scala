// filterNot will take out all elements that satisfy a predicate. An *Array* is also *Traversable*.

val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
array.filterNot(_ < 100) should be(Array(200, 100))