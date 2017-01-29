def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
  new Function1[Int, Int]() {
    def apply(y: Int): Int = x + y
  }
}
addWithoutSyntaxSugar(1).
  isInstanceOf[Function1[Int, Int]] should be(true)

addWithoutSyntaxSugar(2)(3) should be(5)

def fiveAdder: Function1[Int, Int] = addWithoutSyntaxSugar(5)
fiveAdder(5) should be(10)