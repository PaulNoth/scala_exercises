// Set elements can be removed easily:

val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSet = mySet - "Michigan"

aNewSet.contains("Michigan") should be(false)
mySet.contains("Michigan") should be(true)