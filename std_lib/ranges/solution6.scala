// Inclusive ranges can be specified using 'to'.

val someNumbers = Range(0, 34).inclusive
val otherRange = 0 to 34

(someNumbers == otherRange) should be(true)