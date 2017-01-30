// Nil lists are identical, even of different types

val a: List[String] = Nil
val b: List[Int] = Nil

(a == Nil) should be(true)
(a eq Nil) should be(true)

(b == Nil) should be(true)
(b eq Nil) should be(true)

(a == b) should be(true)
(a eq b) should be(true)