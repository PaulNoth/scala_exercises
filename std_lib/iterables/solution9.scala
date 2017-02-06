// If two Iterables aren't the same size, then zipAll can provide fillers for what it couldn't find a complement for:

// E.g. Iterable(x1, x2, x3) zipAll (Iterable(y1, y2), x, y) will return ((x1,y1), (x2, y2), (x3, y)))

val xs = List(3, 5, 9)
val ys = List("Bob", "Ann")
(xs zipAll (ys, -1, "?")) should be(List((3, "Bob"), (5, "Ann"), (9, "?")))

val xt = List(3, 5)
val yt = List("Bob", "Ann", "Stella")
(xt zipAll (yt, -1, "?")) should be(List((3, "Bob"), (5, "Ann"), (-1, "Stella")))