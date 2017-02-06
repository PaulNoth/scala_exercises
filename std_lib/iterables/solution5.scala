// takeRight is the opposite of 'take' in Traversable. It retrieves the last elements of an Iterable.

val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
(list takeRight 3) should be(List(21, 24, 32))