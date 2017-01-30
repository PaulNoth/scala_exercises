// Set elements can be removed in multiple:

val mySet = Set("Michigan", "Ohio", "Wisconsin", "Iowa")
val aNewSet = mySet -- List("Michigan", "Ohio")

aNewSet.contains("Michigan") should be(false)
aNewSet.contains("Wisconsin") should be(true)
aNewSet.size should be(2)