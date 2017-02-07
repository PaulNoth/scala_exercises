// take is used often with *Streams*, and *Streams* after all are *Traversable*.

def streamer(v: Int): Stream[Int] = cons(v, streamer(v + 1))
val a = streamer(2)
(a take 3 toList) should be(List(2, 3, 4))