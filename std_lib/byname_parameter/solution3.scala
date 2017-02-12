// By name parameters can also be used with an *Object* and apply to make interesting block-like calls

object PigLatinizer {
  def apply(x: => String) = x.tail + x.head + "ay"
}

val result = PigLatinizer {
  val x = "pret"
  val z = "zel"
  x ++ z //concatenate the strings
}

result should be("retzelpay")