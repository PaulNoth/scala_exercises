// A backquote can be used to refer to a method parameter as a stable variable to create a case statement:

def patternEquals(i: Int, j: Int) = j match {
  case `i` => true
  case _ ⇒ false
}
patternEquals(3, 3) should be(true)
patternEquals(7, 9) should be(false)
patternEquals(9, 9) should be(true)