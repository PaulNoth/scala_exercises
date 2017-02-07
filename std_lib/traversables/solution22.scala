// hasDefiniteSize will return true if there is traversable that has a finite end, otherwise false.

val map = Map("Phoenix" -> "Arizona", "Austin" -> "Texas")
map.hasDefiniteSize should be(true)

val stream = cons(0, cons(1, Stream.empty))
stream.hasDefiniteSize should be(false)