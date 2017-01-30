// Lists can be *reduced* with a mathematical operation

val a = List(1, 3, 5, 7)
a.reduceLeft(_ + _) should equal(16)
a.reduceLeft(_ * _) should equal(105)