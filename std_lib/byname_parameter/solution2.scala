// A by-name parameter does the same thing as the previous koan but there is no need to explicitly handle Unit or (). This is used extensively in scala to create blocks.

def calc(x: => Int): Either[Throwable, Int] = {
  //x is a call by name parameter
  try {
    Right(x)
  } catch {
    case b: Throwable => Left(b)
  }
}

val y = calc {
  //This looks like a natural block
  println("Here we go!") //Some superfluous call
  val z = List(1, 2, 3, 4) //Another superfluous call
  49 + 20
}

y should be(Right(69))