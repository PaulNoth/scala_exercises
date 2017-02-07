// find will locate the first item that matches a predicate p as *Some* or *None* if an element is not found:

val list = List(10, 19, 45, 1, 22)
list.find(_ % 2 != 0) should be(Some(19))

val list2 = List(4, 8, 16)
list2.find(_ % 2 != 0) should be(None)