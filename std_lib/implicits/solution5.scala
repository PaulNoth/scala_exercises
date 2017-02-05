// Implicit Function Parameters can contain a list of implicits:

def howMuchCanIMake_?(hours: Int)(implicit amount: BigDecimal, currencyName: String) =
  (amount * hours).toString() + " " + currencyName

implicit val hourlyRate = BigDecimal(34)
implicit val currencyName = "Dollars"

howMuchCanIMake_?(30) should be("1020 Dollars")