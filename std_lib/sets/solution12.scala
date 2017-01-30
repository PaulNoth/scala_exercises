// A set is either a subset of another set or it isn't:

val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val mySet2 = Set("Wisconsin", "Michigan", "Minnesota")
val mySet3 = Set("Wisconsin", "Michigan")

mySet2 subsetOf mySet1 should be(false)
mySet3 subsetOf mySet1 should be(true)