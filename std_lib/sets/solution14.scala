// Set equivalency is independent of order:

val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val mySet2 = Set("Wisconsin", "Michigan", "Ohio", "Iowa")

mySet1.equals(mySet2) should be(true)