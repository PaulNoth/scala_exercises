// EQUALS

// It is worth noting that, since the purpose of case classes is to aggregate values,
// comparing case class instances compare their values:

case class Note(name: String, duration: String, octave: Int)
val c3 = Note("C", "Quarter", 3)
val otherC3 = Note("C", "Quarter", 3)
val f3 = Note("F", "Quarter", 3)
(c3 == otherC3) shouldBe true

(c3 == f3) shouldBe false
