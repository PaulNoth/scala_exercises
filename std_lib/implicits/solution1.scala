// Creating a method isOdd for Int, which doesn't exist:

class KoanIntWrapper(val original: Int) {
  def isOdd = original % 2 != 0
}

implicit def thisMethodNameIsIrrelevant(value: Int) = new KoanIntWrapper(value)

19.isOdd should be(true)
20.isOdd should be(false)