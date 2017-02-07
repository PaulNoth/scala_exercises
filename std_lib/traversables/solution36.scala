// filter will take out all elements that don't satisfy a predicate. An *Array* is also *Traversable*.

val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
array.filter(_ < 100) should be(Array(87, 44, 5, 4, 10, 39))