// Enumerations can be declared in one line if you are merely setting variables to Value:

object Planets extends Enumeration {
  val Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto = Value
}

Planets.Mercury.id should be(0)
Planets.Venus.id should be(1)

Planets.Mercury.toString should be("Mercury")
Planets.Venus.toString should be("Venus")

(Planets.Earth == Planets.Earth) should be(true)
(Planets.Neptune == Planets.Jupiter) should be(false)