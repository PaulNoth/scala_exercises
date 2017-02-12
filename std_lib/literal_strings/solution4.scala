// Character Literals can use escape sequences

val e = '\"'
val f = '\\'

e.toString should be("\"")
f.toString should be("\\")