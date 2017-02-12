// A class can be placed inside an abstract class just like in java:

abstract class Soldier(val firstName: String, val lastName: String) {

  class Catch(val number: Long) {
    // nothing to do here.  Just observe that it compiles
  }

}
class Pilot(override val firstName: String, override val lastName: String,
            val squadron: Long) extends Soldier(firstName, lastName)

val pilot = new Pilot("John", "Yossarian", 256)
val catchNo = new pilot.Catch(22) //using the pilot instance's path, create an catch object for it.
catchNo.number should be(22)