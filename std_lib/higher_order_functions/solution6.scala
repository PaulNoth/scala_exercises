def addWithSyntaxSugar(x: Int) = (y: Int) ⇒ x + y

addWithSyntaxSugar(1).isInstanceOf[Function1[Int, Int]] should be(true)
addWithSyntaxSugar(2)(3) should be(5)

def fiveAdder = addWithSyntaxSugar(5)
fiveAdder(5) should be(10)