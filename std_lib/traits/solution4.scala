//Also, the dependencies can't have identical method/property names or else you'll get an illegal inheritance error.

trait B {
  def bId = 2
}

trait A { self: B =>

  def aId = 1
}

//val a = new A  //***does not compile!!!***
val obj = new A with B
(obj.aId + obj.bId) should be(3)