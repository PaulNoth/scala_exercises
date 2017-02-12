// isInstanceOf[className] is used to determine the if an object reference is an instance of given class:

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
intRand.draw.isInstanceOf[Int] should be(true)