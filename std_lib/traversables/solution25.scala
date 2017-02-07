// last will return the last element of an ordered collection, or some random element if order is not defined like in a *Set* or *Map*.

val list = List(10, 19, 45, 1, 22)
list.last should be(22)