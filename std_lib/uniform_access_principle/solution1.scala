class Test1(val age: Int = 10)
class Test2(_age: Int) {
  def age: Int = _age
}

new Test1(10).age should be(10)
new Test2(11).age should be(11)