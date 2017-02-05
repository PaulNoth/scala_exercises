// A partial function is a trait that when implemented can be used as building blocks
// to determine a solution. The trait PartialFunction requires that the method isDefinedAt
// and apply be implemented.

val doubleEvens: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
  //States that this partial function will take on the task
  def isDefinedAt(x: Int) = x % 2 == 0

  //What we do if this partial function matches
  def apply(v1: Int) = v1 * 2
}

val tripleOdds: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
  def isDefinedAt(x: Int) = x % 2 != 0

  def apply(v1: Int) = v1 * 3
}

val whatToDo = doubleEvens orElse tripleOdds //Here we chain the partial functions together

whatToDo(3) should be(9)
whatToDo(4) should be(8)