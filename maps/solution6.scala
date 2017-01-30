// Map keys may be of mixed type:

val myMap = Map("Ann Arbor" -> "MI", 49931 -> "MI")
myMap("Ann Arbor") should be("MI")
myMap(49931) should be("MI")