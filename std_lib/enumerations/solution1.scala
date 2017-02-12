// To create an enumeration, create an object that extends the abstract class Enumeration, and set
// a val variable to the method Value. This is a trick to give values to each val.

// Value assigns a numerical value to fields:

object Planets extends Enumeration {
  val Mercury = Value
  val Venus = Value
  val Earth = Value
  val Mars = Value
  val Jupiter = Value
  val Saturn = Value
  val Uranus = Value
  val Neptune = Value
  val Pluto = Value
}

Planets.Mercury.id should be(0)
Planets.Venus.id should be(1)

Planets.Mercury.toString should be("Mercury") //How does it get the name? by Reflection.
Planets.Venus.toString should be("Venus")

(Planets.Earth == Planets.Earth) should be(true)
(Planets.Neptune == Planets.Jupiter) should be(false)