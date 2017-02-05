// Here we create our own prefix operator for our own class.
// The only identifiers that can be used as prefix operators are +, -, !, and ~:

class Stereo {
  def unary_+ = "on"

  def unary_- = "off"
}

val stereo = new Stereo
(+stereo) should be("on")
(-stereo) should be("off")