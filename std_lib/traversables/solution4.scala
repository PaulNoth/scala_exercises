// flatMap will not only apply the given function on all elements of a *Traversable*, but all elements within the elements and flatten the results:

val list = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10))
val result = list.flatMap(_.map(_ * 4))
result should be(List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40))