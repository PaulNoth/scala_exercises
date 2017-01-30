// Sets may be of mixed type:

val mySet = Set("Michigan", "Ohio", 12)

mySet.contains(12) should be(true)
mySet.contains("MI") should be(false)