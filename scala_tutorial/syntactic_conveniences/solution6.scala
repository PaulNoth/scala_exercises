// Alternatively, you can retrieve the 1st element with the _1 member, the 2nd element with the _2 member, etc:

val is: (Int, String) = (42, "foo")
is._1 shouldBe 42
is._2 shouldBe "foo"
