// Character Literals can be a single character:

val a = 'a'
val b = 'B'

//format(a) is a string format, meaning the "%c".format(x)
//will return the string representation of the char.

"%c".format(a) should be("a")
"%c".format(b) should be("B")