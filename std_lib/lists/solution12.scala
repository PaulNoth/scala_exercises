// Foldleft is like reduce, but with an explicit starting value

val a = List(1, 3, 5, 7)
// NOTE: foldLeft uses a form called currying that we will explore later
a.foldLeft(0)(_ + _) should equal(16)
a.foldLeft(10)(_ + _) should equal(26)
a.foldLeft(1)(_ * _) should equal(105)
a.foldLeft(0)(_ * _) should equal(0)