// EXERCISE

// Complete the following definition of the triangleArea function, which takes a triangle base and height as parameters and returns its area:

def triangleArea(base: Double, height: Double): Double =
  base * height / 2


triangleArea(3, 4) shouldBe 6
triangleArea(5, 6) shouldBe 15
