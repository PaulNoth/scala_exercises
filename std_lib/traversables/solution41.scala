// groupBy will categorize a *Traversable* according to a given function, and return a map with the results. This exercise uses *Partial Function* chaining.

val array = Array(87, 44, 5, 4, 200, 10, 39, 100)

val oddAndSmallPartial: PartialFunction[Int, String] = {
  case x: Int if x % 2 != 0 && x < 100 ⇒ "Odd and less than 100"
}

val evenAndSmallPartial: PartialFunction[Int, String] = {
  case x: Int if x != 0 && x % 2 == 0 && x < 100 ⇒ "Even and less than 100"
}

val negativePartial: PartialFunction[Int, String] = {
  case x: Int if x < 0 ⇒ "Negative Number"
}

val largePartial: PartialFunction[Int, String] = {
  case x: Int if x > 99 ⇒ "Large Number"
}

val zeroPartial: PartialFunction[Int, String] = {
  case x: Int if x == 0 ⇒ "Zero"
}

val result = array groupBy {
  oddAndSmallPartial orElse
    evenAndSmallPartial orElse
    negativePartial orElse
    largePartial orElse
    zeroPartial
}

(result("Even and less than 100") size) should be(3)
(result("Large Number") size) should be(2)