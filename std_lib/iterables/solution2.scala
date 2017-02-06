// grouped will return fixed sized Iterable chucks of an Iterable

val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
val it = list grouped 3
it.next() should be(List(3, 5, 9))
it.next() should be(List(11, 15, 19))
it.next() should be(List(21, 24, 32))