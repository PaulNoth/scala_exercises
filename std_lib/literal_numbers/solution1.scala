// Integer Literals are 32-bit and can be created from decimal, hexadecimal:

val a = 2
val b = 31
val c = 0x30F
val e = 0
val f = -2
val g = -31
val h = -0x30F
a should be(2)
b should be(31)
c should be(783) //Hint: 30F = 783
e should be(0)
f should be(-2)
g should be(-31)
h should be(-783)