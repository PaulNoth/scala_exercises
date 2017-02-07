// Can access class parameters and specify arguments in any order if you use their names:

val me = new WithClassParameters(40, 50, 60)
val myColor = me.addColors(green = 50, red = 60, blue = 40)

myColor should equal(100, 100, 100)