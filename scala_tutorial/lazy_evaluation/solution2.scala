// Exercise

val builder = new StringBuilder

val x = { builder += 'x'; 1 }
lazy val y = { builder += 'y'; 2 }
def z = { builder += 'z'; 3 }

z + y + x + z + y + x

builder.result() shouldBe "xzyz"
