// If a map key is requested using myMap(missingKey) which does not exist a NoSuchElementException will be thrown.
// Default values may be provided using either getOrElse or withDefaultValue for the entire map

val myMap = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
intercept[NoSuchElementException] {
  myMap("TX")
}
myMap.getOrElse("TX", "missing data") should be("missing data")

val myMap2 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa") withDefaultValue "missing data"
myMap2("TX") should be("missing data")