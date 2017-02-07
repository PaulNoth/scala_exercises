// Traversables are the superclass of *Lists*, *Arrays*, *Maps*, *Sets*, *Streams*, and more.
// The methods involved can be applied to each other in a different type. ++ appends two Traversables together.

val set = Set(1, 9, 10, 22)
val list = List(3, 4, 5, 10)
val result = set ++ list
result.size should be(7)

val result2 = list ++ set
result2.size should be(8)