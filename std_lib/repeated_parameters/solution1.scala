// A repeated parameter must be the last parameter and this will let you add as many extra parameters as needed.
// Given:

def repeatedParameterMethod(x: Int, y: String, z: Any*) = {
  "%d %ss can give you %s".format(x, y, z.mkString(", "))
}
// Resolve:

repeatedParameterMethod(3, "egg", "a delicious sandwich", "protein", "high cholesterol") should be(
  "3 eggs can give you a delicious sandwich, protein, high cholesterol"
)