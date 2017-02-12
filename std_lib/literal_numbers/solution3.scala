// Float and Double Literals are IEEE 754 for specific, Float are 32-bit length, Doubles are 64-bit. Floats can be coerced using a f or F suffix, and Doubles can be coerced using a d or D suffix. Exponent are specified using e or E.

val a = 3.0
val b = 3.00
val c = 2.73
val d = 3f
val e = 3.22d
val f = 93e-9
val g = 93E-9
val h = 0.0
val i = 9.23E-9D

a should be(3.0)
b should be(3.0)
c should be(2.73)
d should be(3.0)
e should be(3.22)
f should be(93e-9)
g should be(93E-9)
h should be(0.0)
i should be(9.23e-9)