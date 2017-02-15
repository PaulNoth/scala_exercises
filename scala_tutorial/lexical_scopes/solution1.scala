// Exercise: Scope Rules
// What is the value of result in the following program?

val x = 0
def f(y: Int) = y + 1
val result = {
  val x = f(3)
  x * x
} + x
result shouldBe 16
