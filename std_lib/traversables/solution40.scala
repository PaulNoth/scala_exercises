// partition will split a *Traversable* according to predicate, returning a 2 product *Tuple*. The left hand side contains the elements satisfied by the predicate whereas the right hand side contains those that don't. *Array* is *Traversable*, partition is also defined as (xs filter p, xs filterNot p)

val array = Array(87, 44, 5, 4, 200, 10, 39, 100)
val result = array partition (_ < 100)
result._1 should be(Array(87, 44, 5, 4, 10, 39))
result._2 should be(Array(200, 100))