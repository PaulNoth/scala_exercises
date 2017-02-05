// Implicits rules can be imported into your scope with an import:

object MyPredef {

  class KoanIntWrapper(val original: Int) {
    def isOdd = original % 2 != 0

    def isEven = !isOdd
  }

  implicit def thisMethodNameIsIrrelevant(value: Int) = new KoanIntWrapper(value)
}

import MyPredef._
//imported implicits come into effect within this scope
19.isOdd should be(true)
20.isOdd should be(false)