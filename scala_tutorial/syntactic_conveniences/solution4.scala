// You can retrieve the elements of a tuple by using a tuple pattern:

val is: (Int, String) = (42, "foo")

is match {
  case (i, s) =>
    i shouldBe 42
    s shouldBe "foo"
}
