// Two sets can be intersected easily:

val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val mySet2 = Set("Wisconsin", "Michigan", "Minnesota")
val aNewSet = mySet1 intersect mySet2
// NOTE: Scala 2.7 used **, deprecated for & or intersect in Scala 2.8

aNewSet.equals(Set("Michigan", "Wisconsin")) should be(true)