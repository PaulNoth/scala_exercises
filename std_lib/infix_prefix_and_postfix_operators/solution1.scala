// Any method which takes a single parameter can be used as an infix operator: a.m(b)
// can be written a m b.

val g: Int = 3
(g + 4) should be(7) // + is an infix operator
g.+(4) should be(7)