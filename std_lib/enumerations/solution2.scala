// You can create an enumeration with your own index and your own Strings,
// in this exercise we will start with an index of one and use Greek names instead of Roman:

object GreekPlanets extends Enumeration {

  val Mercury = Value(1, "Hermes")
  val Venus = Value(2, "Aphrodite")
  //Fun Fact: Tellus is Roman for (Mother) Earth
  val Earth = Value(3, "Gaia")
  val Mars = Value(4, "Ares")
  val Jupiter = Value(5, "Zeus")
  val Saturn = Value(6, "Cronus")
  val Uranus = Value(7, "Ouranus")
  val Neptune = Value(8, "Poseidon")
  val Pluto = Value(9, "Hades")
}

GreekPlanets.Mercury.id should be(1)
GreekPlanets.Venus.id should be(2)

GreekPlanets.Mercury.toString should be("Hermes")
GreekPlanets.Venus.toString should be("Aphrodite")

(GreekPlanets.Earth == GreekPlanets.Earth) should be(true)
(GreekPlanets.Neptune == GreekPlanets.Jupiter) should be(false)