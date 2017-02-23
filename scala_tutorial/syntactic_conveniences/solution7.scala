// Here, we say that the step parameter has a default value, 1.

// Then, at use site we can omit to supply this parameter and the compiler will supply it for us, by using its default value:

case class Range(start: Int, end: Int, step: Int = 1)

val xs = Range(start = 1, end = 10)

xs.step shouldBe 1
