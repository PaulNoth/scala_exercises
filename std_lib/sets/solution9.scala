// Attempted removal of nonexistent elements from a set is handled gracefully:

val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSet = mySet - "Minnesota"

aNewSet.equals(mySet) should be(true)