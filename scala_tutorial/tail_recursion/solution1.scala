// EXERCISE

// Complete the following definition of a tail-recursive version of factorial:

def factorial(n: Int): Int = {
  @tailrec
  def iter(x: Int, result: Int): Int =
    if (x == 0) result
    else iter(x - 1, result * x)

  iter(n, 1)
}

factorial(3) shouldBe 6
factorial(4) shouldBe 24