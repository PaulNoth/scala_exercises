// toMap will convert a *Set* to a *Map*, it should be of parameterized type *Tuple2*.

val set = Set("Phoenix" -> "Arizona", "Austin" -> "Texas")
val result = set.toMap
result.isInstanceOf[Map[_, _]] should be(true)