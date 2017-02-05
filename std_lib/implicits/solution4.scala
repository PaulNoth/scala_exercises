// Implicits can be used to declare a value to be provided as a default as long
// as an implicit value is set with in the scope.
// These are called Implicit Function Parameters:

def howMuchCanIMake_?(hours: Int)(implicit dollarsPerHour: BigDecimal) = dollarsPerHour * hours

implicit val hourlyRate = BigDecimal(34)

howMuchCanIMake_?(30) should be(1020)