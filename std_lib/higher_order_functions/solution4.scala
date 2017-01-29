def summation(x: Int, y: Int ⇒ Int) = y(x)

var incrementer = 3
def closure = (x: Int) => x + incrementer

val result = summation(10, closure)
result should be(13)

incrementer = 4
val result2 = summation(10, closure)
result2 should be(14)