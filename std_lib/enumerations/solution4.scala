// Enumerations can be declared with a string value only:

object GreekPlanets extends Enumeration {

  val Mercury = Value("Hermes")
  val Venus = Value("Aphrodite")
  val Earth = Value("Gaia")
  val Mars = Value("Ares")
  val Jupiter = Value("Zeus")
  val Saturn = Value("Cronus")
  val Uranus = Value("Ouranus")
  val Neptune = Value("Poseidon")
  val Pluto = Value("Hades")
}

GreekPlanets.Mercury.id should be(0)
GreekPlanets.Venus.id should be(1)

GreekPlanets.Mercury.toString should be("Hermes")
GreekPlanets.Venus.toString should be("Aphrodite")

(GreekPlanets.Earth == GreekPlanets.Earth) should be(true)
(GreekPlanets.Neptune == GreekPlanets.Jupiter) should be(false)