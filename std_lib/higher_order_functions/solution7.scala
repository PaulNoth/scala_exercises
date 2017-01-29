def addWithSyntaxSugar(x: Int) = (y: Int) => x + y

addWithSyntaxSugar(1).isInstanceOf[Function1[_, _]] should be(true)