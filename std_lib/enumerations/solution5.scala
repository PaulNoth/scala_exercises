// You can extend the Enumeration by extending the Value class.

object Planets extends Enumeration {

  val G = 6.67300E-11

  class PlanetValue(val i: Int, val name: String, val mass: Double, val radius: Double)
    extends Val(i: Int, name: String) {

    def surfaceGravity = G * mass / (radius * radius)

    def surfaceWeight(otherMass: Double) = otherMass * surfaceGravity

    def compare(that: PlanetValue) = this.i - that.i
  }

  val Mercury = new PlanetValue(0, "Mercury", 3.303e+23, 2.4397e6)
  val Venus = new PlanetValue(1, "Venus", 4.869e+24, 6.0518e6)
  val Earth = new PlanetValue(2, "Earth", 5.976e+24, 6.37814e6)
  val Mars = new PlanetValue(3, "Mars", 6.421e+23, 3.3972e6)
  val Jupiter = new PlanetValue(4, "Jupiter", 1.9e+27, 7.1492e7)
  val Saturn = new PlanetValue(5, "Saturn", 5.688e+26, 6.0268e7)
  val Uranus = new PlanetValue(6, "Uranus", 8.686e+25, 2.5559e7)
  val Neptune = new PlanetValue(7, "Neptune", 1.024e+26, 2.4746e7)
  val Pluto = new PlanetValue(8, "Pluto", 1.27e+22, 1.137e6)

}

Planets.Earth.mass should be(5.976e+24)
Planets.Earth.radius should be(6.37814e6)