// Map elements can be removed easily:

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
val aNewMap = myMap - "MI"
aNewMap.contains("MI") should be(false)
myMap.contains("MI") should be(true)