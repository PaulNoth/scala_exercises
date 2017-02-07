// flatten will smash all child *Traversables* within a *Traversable*

val list = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10))
list.flatten should be(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))