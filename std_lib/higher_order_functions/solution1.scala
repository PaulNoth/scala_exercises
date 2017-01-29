def lambda = { x: Int => x + 1 }
def lambda2 = (x: Int) => x + 1
val lambda3 = (x: Int) => x + 1

val lambda4 = new Function1[Int, Int] {
  def apply(v1: Int): Int = v1 + 1
}

def lambda5(x: Int) = x + 1

val result = lambda(3)
val `result1andhalf` = lambda.apply(3)

val result2 = lambda2(3)
val result3 = lambda3(3)
val result4 = lambda4(3)
val result5 = lambda5(3)

result should be(4)
result1andhalf should be(4)
result2 should be(4)
result3 should be(4)
result4 should be(4)
result5 should be(4)