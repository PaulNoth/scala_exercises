// toArray will convert any *Traversable* to an Array, which is a special wrapper around a primitive *Java* array.

val set = Set(4, 6, 7, 8, 9, 13, 14)
val result = set.toArray
result.isInstanceOf[Array[Int]] should be(true)