// In contrast to Java, all values in Scala are objects (including numerical values and functions).
// Since Scala is class-based, all values are instances of a class.

//Class hierarchy is linear, a class can only extend from one parent class:

class Soldier(val firstName: String, val lastName: String) {}
class Pilot(override val firstName: String, override val lastName: String,
            val squadron: Long) extends Soldier(firstName, lastName)
val pilot = new Pilot("John", "Yossarian", 256)

pilot.firstName should be("John")
pilot.lastName should be("Yossarian")