// collect will apply a partial function to all elements of a *Traversable* and will return a different collection. In this exercise, a case fragment is a partial function:

val list = List(4, 6, 7, 8, 9, 13, 14)
val result = list.collect {
  case x: Int if (x % 2 == 0) => x * 3
}
result should be(List(12, 18, 24, 42))