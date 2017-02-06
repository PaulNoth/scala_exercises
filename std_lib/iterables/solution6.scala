// dropRight will drop the number of elements from the right.

val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32)
(list dropRight 3) should be(List(3, 5, 9, 11, 15, 19))