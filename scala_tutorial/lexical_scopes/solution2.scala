// EXERCISE

object Foo {
  val x = 1
}
object Bar {
  val x = 2
}
object Baz {
  import Bar.x
  val y = x + Foo.x
}

Baz.y shouldBe 3
