// Let’s define a method that computes the area of a disc, given its radius:

def square(x: Double) = x * x

def area(radius: Double): Double = 3.14159 * square(radius)

area(10) shouldBe 314.159
