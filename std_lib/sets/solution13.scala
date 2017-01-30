// The difference between two sets can be obtained easily:

val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val mySet2 = Set("Wisconsin", "Michigan")
val aNewSet = mySet1 diff mySet2 // Note: you can use the "&~" operator if you *really* want to.

aNewSet.equals(Set("Ohio", "Iowa")) should be(true)