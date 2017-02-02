// Partially applied functions can replace any number of arguments:

def sum(a: Int, b: Int, c: Int) = a + b + c
val sumC = sum(1, 10, _: Int)
sumC(4) should be(15)
sum(4, 5, 6) should be(15)