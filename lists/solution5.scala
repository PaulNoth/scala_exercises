val a = List(1, 2, 3)
a.headOption should equal(Some(1))
a.tail should equal(List(2, 3))