// Given a from index, and a to index, slice will return the part of the collection including from, and excluding to:

val list = List(10, 19, 45, 1, 22)
list.slice(1, 3) should be(List(19, 45))