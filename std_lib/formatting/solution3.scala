// Character Literals can be an escape sequence, including octal or hexidecimal:

val c = '\u0061' //unicode for a
val d = '\141' //octal for a
val e = '\"'
val f = '\\'

"%c".format(c) should be("a")
"%c".format(d) should be("a")
"%c".format(e) should be("\"")
"%c".format(f) should be("\\")