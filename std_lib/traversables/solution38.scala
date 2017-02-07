// splitAt will split a *Traversable* at a position, returning a 2 product *Tuple*. splitAt is also defined as (xs take n, xs drop n)

val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
val result = array splitAt 3
result._1 should be(Array(87, 44, 5))
result._2 should be(Array(4, 200, 10, 39, 100))