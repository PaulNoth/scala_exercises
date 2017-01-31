// To obtain the second element you can expand on the pattern. Where x is the first element, y is the second element, and xs is the rest:

val secondElement = List(1, 2, 3) match {
  case x :: y :: xs => y
  case _ => 0
}

secondElement should be(2)