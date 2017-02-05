// Default arguments, though, are preferred to Implicit Function Parameters:

def howMuchCanIMake_?(hours: Int, amount: BigDecimal = 34, currencyName: String = "Dollars") =
  (amount * hours).toString() + " " + currencyName

howMuchCanIMake_?(30) should be("1020 Dollars")

howMuchCanIMake_?(30, 95) should be("2850 Dollars")