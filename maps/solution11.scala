// Map elements can be removed with a tuple:

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
val aNewMap = myMap - ("MI", "WI") // Notice: single '-' operator for tuples

aNewMap.contains("MI") should be(false)
myMap.contains("MI") should be(true)
aNewMap.contains("OH") should be(true)
aNewMap.size should be(2)
myMap.size should be(4)