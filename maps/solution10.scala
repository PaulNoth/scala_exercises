// Map elements can be removed in multiple:

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
val aNewMap = myMap -- List("MI", "OH")
aNewMap.contains("MI") should be(false)
myMap.contains("MI") should be(true)

aNewMap.contains("WI") should be(true)
aNewMap.size should be(2)
myMap.size should be(4)