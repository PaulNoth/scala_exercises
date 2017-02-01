// A range's upper bound is not inclusive:

val someNumbers = Range(0, 10)
val second = someNumbers(1)
val last = someNumbers.last

someNumbers.size should be(10)
second should be(1)
last should be(9)