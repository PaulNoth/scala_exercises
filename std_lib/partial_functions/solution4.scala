// The result of partial functions can have an andThen function added to the end of the chain
// used to continue onto another chain of logic:

val doubleEvens: PartialFunction[Int, Int] = {
  case x if (x % 2) == 0 => x * 2
}
val tripleOdds: PartialFunction[Int, Int] = {
  case x if (x % 2) != 0 => x * 3
}

val printEven: PartialFunction[Int, String] = {
  case x if (x % 2) == 0 => "Even"
}
val printOdd: PartialFunction[Int, String] = {
  case x if (x % 2) != 0 => "Odd"
}

val whatToDo = doubleEvens orElse tripleOdds andThen (printEven orElse printOdd)

whatToDo(3) should be("Odd")
whatToDo(4) should be("Even")