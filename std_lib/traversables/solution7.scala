// collect will apply a partial function to all elements of a *Traversable* and will return a different collection. In this exercise, two case fragments are chained to create a more robust result:

val list = List(4, 6, 7, 8, 9, 13, 14)
val partialFunction1: PartialFunction[Int, Int] = {
  case x: Int if x % 2 == 0 => x * 3
}
val partialFunction2: PartialFunction[Int, Int] = {
  case y: Int if y % 2 != 0 => y * 4
}
val result = list.collect(partialFunction1 orElse partialFunction2)
result should be(List(12, 18, 28, 24, 36, 52, 42))