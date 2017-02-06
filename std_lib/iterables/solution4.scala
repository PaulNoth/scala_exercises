// sliding can take the size of the window as well the size of the step during each iteration

val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
val it = list sliding (3, 3)
it.next() should be(List(3, 5, 9))
it.next() should be(List(11, 15, 19))
it.next() should be(List(21, 24, 32))