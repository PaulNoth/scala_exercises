// () => Int is a Function type that takes a Unit type. Unit is known as void to a Java programmer. The function returns an Int. You can place this as a method parameter so that you can you use it as a block, but still it doesn't look quite right.

def calc(x: () => Int): Either[Throwable, Int] = {
  try {
    Right(x()) //An explicit call of the x function
  } catch {
    case b: Throwable ⇒ Left(b)
  }
}

val y = calc { () => //Having explicitly declaring that Unit is a parameter with ()
  14 + 15
}

y should be(Right(29))