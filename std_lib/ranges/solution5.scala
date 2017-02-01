// Range can specify to include its upper bound value

val someNumbers = Range(0, 34).inclusive

someNumbers.contains(34) should be(true)