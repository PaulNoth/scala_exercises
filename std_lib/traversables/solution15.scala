// toStream will convert any *Traversable* to a Stream which is a lazy list where elements are evaluated as they are needed.

val list = List(4, 6, 7, 8, 9, 13, 14)
val result = list.toStream
result.isInstanceOf[Stream[_]] should be(true)
(result take 3) should be(Stream(4, 6, 7))