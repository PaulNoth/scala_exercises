// Ranges can be specified using 'until'.

val someNumbers = Range(0, 10)
val otherRange = 0 until 10

(someNumbers == otherRange) should be(true)