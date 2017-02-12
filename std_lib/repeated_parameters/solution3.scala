// A repeated parameter can accept a collection,and if you want it expanded, add :_*

repeatedParameterMethod(3, "egg", List("a delicious sandwich", "protein", "high cholesterol"): _*) should be(
  "3 eggs can give you a delicious sandwich, protein, high cholesterol"
)