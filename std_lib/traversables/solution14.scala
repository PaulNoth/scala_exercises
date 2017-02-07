// toIndexedSeq will convert any *Traversable* to an *IndexedSeq* which is an indexed sequence used in *Vectors* and *Strings*

val set = Set(4, 6, 7, 8, 9, 13, 14)
val result = set.toIndexedSeq
result.isInstanceOf[IndexedSeq[_]] should be(true)