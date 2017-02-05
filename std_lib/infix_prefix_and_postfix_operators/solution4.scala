// Prefix operators work if an object has a method name that starts with unary_ :

val g: Int = 31
(-g) should be(-31)