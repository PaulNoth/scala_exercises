// Maps can be added to easily:

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "MI" -> "Michigan")
val aNewMap = myMap + ("IL" -> "Illinois")
aNewMap.contains("IL") should be(true)