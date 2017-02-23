// However, prior to Scala 2.12, Either was “unbiased”. You had to explicitly specify which “side” (Left or Right) you wanted to map:

def triple(x: Int): Int = 3 * x

def tripleEither(x: Either[String, Int]): Either[String, Int] =
  x.right.map(triple)

tripleEither(Right(1)) shouldBe Right(3)

tripleEither(Left("not a number")) shouldBe Left("not a number")
