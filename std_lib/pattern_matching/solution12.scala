val r = List(1, 2, 3) match {
  case x :: y :: z :: tail ⇒ tail
  case _ ⇒ 0
}

r == Nil should be(
  true
)