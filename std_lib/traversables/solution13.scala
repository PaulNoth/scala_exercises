// toSeq will convert any *Traversable* to a *Seq* which is an ordered Iterable and is the superclass to *List*, *Queues*, and *Vectors*. *Sequences* provide a method apply for indexing. Indices range from 0 up the length of a sequence.

val set = Set(4, 6, 7, 8, 9, 13, 14)
val result = set.toSeq
result.isInstanceOf[Seq[_]] should be(true)