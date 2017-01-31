// Same koan as above, but we are pattern matching a list with only one item!

val secondElement = List(1) match {
  case x :: y :: xs => y
  case _ => 0
}

secondElement should be(0)