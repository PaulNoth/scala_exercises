// A range does not include its upper bound, even in a step increment:

val someNumbers = Range(0, 34, 2)
someNumbers.contains(33) should be(false)
someNumbers.contains(32) should be(true)
someNumbers.contains(34) should be(false)