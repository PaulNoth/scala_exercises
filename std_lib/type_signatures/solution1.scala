// A trait can be declared containing a type, where a concrete implementer will satisfy the type:

trait Randomizer[A] {
  def draw(): A
}

class IntRandomizer extends Randomizer[Int] {
  def draw() = {
    import util.Random
    Random.nextInt()
  }
}

val intRand = new IntRandomizer
(intRand.draw < Int.MaxValue) should be(true)