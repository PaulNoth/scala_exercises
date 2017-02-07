// toList, as well as other conversion methods like toSet, toArray, will not convert if the collection type is the same.

val list = List(5, 6, 7, 8, 9)
val result = list.toList
result eq list should be(true)