// toList will convert any *Traversable* to a List.

val set = Set(4, 6, 7, 8, 9, 13, 14)
val result = set.toList

result.isInstanceOf[List[_]] should be(true)