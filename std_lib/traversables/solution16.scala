// toSet will convert any *Traversable* to a *Set* which is a collection of unordered, unique values.

val list = List(4, 6, 7, 8, 9, 13, 14)
val result = list.toSet
result.isInstanceOf[Set[_]] should be(true)