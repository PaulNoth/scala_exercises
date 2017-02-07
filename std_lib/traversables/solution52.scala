// mkString will format a *Traversable* using a given string as the delimiter.

val list = List(1, 2, 3, 4, 5)
list.mkString(",") should be("1,2,3,4,5")