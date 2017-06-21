// Lists reuse their tails

val d = Nil
val c = 3 :: d
val b = 2 :: c
val a = 1 :: b

a should be(List(1, 2, 3))
a.tail should be(List(2, 3))
b.tail should be(List(3))
c.tail should be(Nil)