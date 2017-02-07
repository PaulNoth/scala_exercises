// mkString will also take a beginning and ending string to surround the list.

val list = List(1, 2, 3, 4, 5)
list.mkString(">", ",", "<") should be(">1,2,3,4,5<")