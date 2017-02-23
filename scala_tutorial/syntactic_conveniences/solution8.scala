// Repeated Parameters

// You can define a function that can receive an arbitrary number of parameters (of the same type) as follows:

def average(x: Int, xs: Int*): Double =
  (x :: xs.to[List]).sum.toDouble / (xs.size + 1)

average(1) shouldBe 1.0
average(1, 2) shouldBe 1.5
average(1, 2, 3) shouldBe 2.0
