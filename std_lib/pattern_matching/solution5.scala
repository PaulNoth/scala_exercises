// Pattern matching can substitute parts of expressions:

def goldilocks(expr: Any) = expr match {
  case ("porridge", bear) => bear + " said someone's been eating my porridge"
  case ("chair", bear) => bear + " said someone's been sitting in my chair"
  case ("bed", bear) => bear + " said someone's been sleeping in my bed"
  case _ => "what?"
}

goldilocks(("porridge", "Papa")) should be(
  "Papa said someone's been eating my porridge"
)
goldilocks(("chair", "Mama")) should be(
  "Mama said someone's been sitting in my chair"
)