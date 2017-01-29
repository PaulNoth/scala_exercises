// You can assign multiple variables at once using tuples:

val student = ("Sean Rogers", 21, 3.5)
val (name, age, gpa) = student

name should be("Sean Rogers")
age should be(21)
gpa should be(3.5)