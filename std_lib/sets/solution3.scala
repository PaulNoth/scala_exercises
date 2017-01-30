// Sets can be added to easily:

val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSet = mySet + "Illinois"

aNewSet.contains("Illinois") should be(true)
mySet.contains("Illinois") should be(false)