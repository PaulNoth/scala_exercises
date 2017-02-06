// sliding will return an Iterable that shows a sliding window of an Iterable.

val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
val it = list sliding 3
it.next() should be(List(3, 5, 9))
it.next() should be(List(5, 9, 11))
it.next() should be(List(9, 11, 15))