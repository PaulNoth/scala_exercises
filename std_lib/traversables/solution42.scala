// forall will determine if a predicate is valid for all members of a *Traversable*.

val list = List(87, 44, 5, 4, 200, 10, 39, 100)
val result = list forall (_ < 100)
result should be(false)