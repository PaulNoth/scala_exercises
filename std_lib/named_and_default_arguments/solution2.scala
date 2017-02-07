// Can default arguments if you leave them off:

val me = new WithoutClassParameters()
val myColor = me.addColorsWithDefaults(green = 255)

myColor should equal(0, 255, 0)