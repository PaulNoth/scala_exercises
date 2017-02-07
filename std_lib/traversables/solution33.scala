// drop will take the rest of the *Traversable* except the number of elements given

def streamer(v: Int): Stream[Int] = cons(v, streamer(v + 1))
val a = streamer(2)
((a drop 6) take 3).toList should be(List(8, 9, 10))