// Long Literals are 64 bit, are specified by appending an L or l at the end:

val a = 2L
val b = 31L
val c = 0x30FL
val e = 0L
val f = -2l
val g = -31L
val h = -0x30FL

a should be(2)
b should be(31)
c should be(783) //Hint: 30F = 783
e should be(0)
f should be(-2)
g should be(-31)
h should be(-783)