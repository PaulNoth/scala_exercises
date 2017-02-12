// A repeated parameter can accept a collection as the last parameter but will be considered a single object:

repeatedParameterMethod(3, "egg", List("a delicious sandwich", "protein", "high cholesterol")) should be(
  "3 eggs can give you List(a delicious sandwich, protein, high cholesterol)"
)