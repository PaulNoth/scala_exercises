// To pattern match against a List, the list can be broken out into parts, in this case the head x and the tail xs.
// Since the case doesn't terminate in Nil, xs is interpreted as the rest of the list:

val secondElement = List(1, 2, 3) match {
  case x :: xs => xs.head
  case _ => 0
}

secondElement should be(2)