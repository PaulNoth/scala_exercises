// Infix Operators do NOT work if an object has a method that takes two parameters:

val g: String = "Check out the big brains on Brad!"

g indexOf 'o' should be(6) //indexOf(Char) can be used as an infix operator

// g indexOf 'o', 4 should be (6) //indexOf(Char, Int) cannot be used as an infix operator

g.indexOf('o', 7) should be(25)