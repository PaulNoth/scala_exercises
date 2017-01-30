// Two sets can be joined as their union easily:

val mySet1 = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val mySet2 = Set("Wisconsin", "Michigan", "Minnesota")
val aNewSet = mySet1 union mySet2 // NOTE: You can also use the "|" operator

aNewSet.equals(Set("Michigan", "Wisconsin", "Ohio", "Iowa", "Minnesota")) should be(true)