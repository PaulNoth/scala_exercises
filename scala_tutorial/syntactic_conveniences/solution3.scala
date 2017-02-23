// We saw earlier that case classes are useful to aggregate information. However, sometimes you want to aggregate
// information without having to define a complete case class for it. In such a case you can use tuples:

def pair(i: Int, s: String): (Int, String) = (i, s)

pair(42, "foo") shouldBe (42, "foo")
pair(0, "bar") shouldBe(0, "bar")
