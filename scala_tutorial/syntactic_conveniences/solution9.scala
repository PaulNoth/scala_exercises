// TYPE ALIASES

// In the same way as you can give meaningful names to expressions, you can give meaningful names to type expressions:

type Result = Either[String, (Int, Int)]
def divide(dividend: Int, divisor: Int): Result =
  if (divisor == 0) Left("Division by zero")
  else Right((dividend / divisor, dividend % divisor))

divide(6, 4) shouldBe Right((1, 2))
divide(2, 0) shouldBe Left("Division by zero")
divide(8, 4) shouldBe Right(2, 0)
