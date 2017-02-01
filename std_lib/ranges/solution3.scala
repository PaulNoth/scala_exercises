// Range can specify a step for an increment:

val someNumbers = Range(2, 10, 3)
val second = someNumbers(1)
val last = someNumbers.last

someNumbers.size should be(3)
second should be(5)
last should be(8)