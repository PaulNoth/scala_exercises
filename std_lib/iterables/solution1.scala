// Quite a few subclasses of Iterable override this standard implementation of foreach in Iterable,
// because they can provide a more efficient implementation. Remember that foreach is the
// basis of the implementation of all operations in Traversable, so its performance matters.

// Some known iterables are *Sets*, *Lists*, *Vectors*, *Stacks*, and *Streams*. Iterator has two important methods:
// hasNext, which answers whether the iterator has another element available. next which will return the next element in the iterator.

val list = List(3, 5, 9, 11, 15, 19, 21)
val it = list.iterator
if (it.hasNext) {
  it.next should be(3)
}