// Set elements can be removed with a tuple:

val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSet = mySet - ("Michigan", "Ohio") // Notice: single '-' operator for tuples

aNewSet.contains("Michigan") should be(false)
aNewSet.contains("Wisconsin") should be(true)
aNewSet.size should be(2)