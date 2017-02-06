// You can also filter Arrays in the same way:

val a = Array("hello", "to", "you", "again")
val filtered = a.filter(_.length > 3)
filtered should be(Array("hello", "again"))