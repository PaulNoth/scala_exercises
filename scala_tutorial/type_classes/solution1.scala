// Define an ordering for the Rational type:

class Rational(x: Int, y: Int) {

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  lazy val numer: Int = x / g
  lazy val denom: Int = y / g
}

// Run

val compareRationals: (Rational, Rational) => Int =
  (x: Rational, y: Rational) => if(x.numer == y.numer) (x.denom - y.denom) else (x.numer - y.numer)


implicit val rationalOrder: Ordering[Rational] =
  new Ordering[Rational] {
    def compare(x: Rational, y: Rational): Int = compareRationals(x, y)
  }

val half = new Rational(1, 2)
val third = new Rational(1, 3)
val fourth = new Rational(1, 4)
val rationals = List(third, half, fourth)
insertionSort(rationals) shouldBe List(fourth, third, half)