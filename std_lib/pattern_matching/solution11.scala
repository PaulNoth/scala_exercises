// To pattern match against List, you can also establish a pattern match if you know the exact number of elements in a List:

val r = List(1, 2, 3) match {
  case x :: y :: Nil => y
  case _ => 0
}

r should be(0)