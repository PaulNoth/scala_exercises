// Can specify arguments in any order if you use their names:

val me = new WithoutClassParameters()

// what happens if you change the order of these parameters (nothing)
val myColor = me.addColors(green = 0, red = 255, blue = 0)

// for koan, remove the values in the should equal
myColor should equal(255, 0, 0)