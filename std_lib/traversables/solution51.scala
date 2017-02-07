// transpose will take a traversable of traversables and group them by their position in it's own traversable.
// E.g.: ((x1, x2),(y1, y2)).transpose = (x1, y1), (x2, y2)
// or ((x1, x2, x3),(y1, y2, y3),(z1, z2, z3)).transpose = ((x1, y1, z1), (x2, y2, z2), (x3, y3, z3))

val list = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
list.transpose should be(List(List(1, 4, 7), List(2, 5, 8), List(3, 6, 9)))

val list2 = List(List(1), List(4))
list2.transpose should be(List(List(1, 4)))