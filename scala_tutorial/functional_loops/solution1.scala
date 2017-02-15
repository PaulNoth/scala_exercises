// EXERCISE

// Complete the following method definition that computes the factorial of a number:

def factorial(n: Int): Int =
  if (n == 0) 1
  else factorial(n - 1) * n

factorial(3) shouldBe 6
factorial(4) shouldBe 24