// Map values can be iterated:

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")

val mapValues = myMap.values
mapValues.size should be(3)
mapValues.head should be("Michigan") //Failed presumption: The order in maps is not guaranteed

val lastElement = mapValues.last
lastElement should be("Wisconsin")