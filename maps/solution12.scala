// Attempted removal of nonexistent elements from a map is handled gracefully:

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
val aNewMap = myMap - "MN"

aNewMap.equals(myMap) should be(true)