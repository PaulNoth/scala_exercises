// toMap will convert any *Traversable* to a *Map*. How it's used depends on the original collection; if it's a *List* or *Seq*, it should be of parameterized type *Tuple2*.

val list = List("Phoenix" -> "Arizona", "Austin" -> "Texas")
val result = list.toMap
result.isInstanceOf[Map[_, _]] should be(true)