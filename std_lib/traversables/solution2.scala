// map will apply the given function on all elements of a *Traversable* and return a new collection of the result.

val set = Set(1, 3, 4, 6)
val result = set.map(_ * 4)
result.lastOption should be(Option(24))