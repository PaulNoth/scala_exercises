// Formatting can be used for any number of items, like a string and a number:

val j = 190
val k = "vodka"

"%d bottles of %s on the wall".format(j - 100, k) should be("90 bottles of vodka on the wall")