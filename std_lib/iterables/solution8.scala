// If two Iterables aren't the same size, then zip will only zip what can only be paired.

// E.g. Iterable(x1, x2, x3) zip Iterable(y1, y2) will return ((x1,y1), (x2, y2))

val xs = List(3, 5, 9)
val ys = List("Bob", "Ann")
(xs zip ys) should be(List((3, "Bob"), (5, "Ann")))