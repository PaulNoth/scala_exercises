// Currying allows you to create specialized version of generalized function

def customFilter(f: Int => Boolean)(xs: List[Int]) = {
  xs filter f
}
def onlyEven(x: Int) = x % 2 == 0
val xs = List(12, 11, 5, 20, 3, 13, 2)
customFilter(onlyEven)(xs) should be(List(12, 20, 2))

val onlyEvenFilter = customFilter(onlyEven) _
onlyEvenFilter(xs) should be(List(12, 20, 2))