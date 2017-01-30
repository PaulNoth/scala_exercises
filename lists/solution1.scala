// eq tests identity (same object)

val a = List(1, 2, 3)
val b = List(1, 2, 3)
(a eq b) should be(false)