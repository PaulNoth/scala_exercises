// Case statements are a quick way to create partial functions.
// When you create a case statement, the apply and isDefinedAt is created for you.

val doubleEvens: PartialFunction[Int, Int] = {
  case x if (x % 2) == 0 => x * 2
}
val tripleOdds: PartialFunction[Int, Int] = {
  case x if (x % 2) != 0 => x * 3
}

val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together
whatToDo(3) should be(9)
whatToDo(4) should be(8)