// Can default class parameters and have default arguments too

val me = new WithClassParametersInClassDefinition()
val myColor = me.addColorsWithDefaults(green = 70)

myColor should equal(0, 325, 100)