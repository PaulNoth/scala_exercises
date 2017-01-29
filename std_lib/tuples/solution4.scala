// Tuples items can be swapped on a Tuple 2

val tuple = ("apple", 3).swap
tuple._1 should be(3)
tuple._2 should be("apple")