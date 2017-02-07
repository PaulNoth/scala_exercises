// flatMap of Options will filter out all Nones and Keep the Somes

val list = List(1, 2, 3, 4, 5)
val result = list.flatMap(it => if (it % 2 == 0) Some(it) else None)
result should be(List(2, 4))