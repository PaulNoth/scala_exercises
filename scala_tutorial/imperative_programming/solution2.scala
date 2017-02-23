// Complete the following imperative implementation of factorial:

def factorial(n: Int): Int = {
  var result = 1
  var i = 1

  while (i <= n) {
    result = result * i
    i = i + 1
  }
  result
}

factorial(2) shouldBe 2
factorial(3) shouldBe 6
factorial(4) shouldBe 24
factorial(5) shouldBe 120