// Maps insertion with duplicate key updates previous entry with subsequent value:

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Meechigan")
val mapValues = myMap.values
mapValues.size should be(3)
myMap("MI") should be("Meechigan")