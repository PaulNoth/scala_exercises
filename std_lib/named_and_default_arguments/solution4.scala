// Can access class parameters and default arguments if you leave them off

val me = new WithClassParameters(10, 20, 30)
val myColor = me.addColorsWithDefaults(green = 70)

myColor should equal(10, 90, 30)