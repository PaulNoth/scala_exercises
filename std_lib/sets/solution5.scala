// Sets can be checked for member existence:

val mySet = Set("Michigan", "Ohio", 12)

mySet(12) should be(true)
mySet("MI") should be(false)