// zip will stitch two iterables into an iterable of pairs of corresponding elements from both iterables.

// E.g. Iterable(x1, x2, x3) zip Iterable(y1, y2, y3) will return ((x1,y1), (x2, y2), (x3, y3)):

val xs = List(3, 5, 9)
val ys = List("Bob", "Ann", "Stella")
(xs zip ys) should be(List((3, "Bob"), (5, "Ann"), (9, "Stella")))