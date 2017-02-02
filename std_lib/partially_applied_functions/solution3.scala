// Currying is a technique to transform function with multiple parameters into multiple functions which each take one parameter

def multiply(x: Int, y: Int) = x * y
(multiply _).isInstanceOf[Function2[_, _, _]] should be(true)
val multiplyCurried = (multiply _).curried
multiply(4, 5) should be(20)
multiplyCurried(3)(2) should be(6)
val multiplyCurriedFour = multiplyCurried(4)
multiplyCurriedFour(2) should be(8)
multiplyCurriedFour(4) should be(16)