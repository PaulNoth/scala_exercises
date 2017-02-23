// Complete the following implementation of the size function that returns the size of a given list.

def size[A](xs: List[A]): Int =
  xs match {
    case Nil => 0
    case y :: ys => 1 + size(ys)
  }
size(Nil) shouldBe 0
size(List(1, 2)) shouldBe 2
size(List("a", "b", "c")) shouldBe 3