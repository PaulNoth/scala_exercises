// span will split a *Traversable* according to predicate, returning a 2 product *Tuple*. span is also defined as (xs takeWhile p, xs dropWhile p)

val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
val result = array span (_ < 100)
result._1 should be(Array(87, 44, 5, 4))
result._2 should be(Array(200, 10, 39, 100))