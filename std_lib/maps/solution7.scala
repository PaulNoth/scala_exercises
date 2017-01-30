// Maps may be accessed:

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
myMap("MI") should be("Michigan")
myMap("IA") should be("Iowa")