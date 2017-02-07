// toIterable will convert any *Traversable* to an *Iterable*. This is a base *trait* for all Scala collections that define an iterator method to step through one-by-one the collection's elements.

val set = Set(4, 6, 7, 8, 9, 13, 14)
val result = set.toIterable
result.isInstanceOf[Iterable[_]] should be(true)