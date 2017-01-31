// A backquote can be used to refer to a stable variable in scope to create a case statement. This prevents what is called "Variable Shadowing"

val foodItem = "porridge"

def goldilocks(expr: Any) = expr match {
  case (`foodItem`, _) => "eating"
  case ("chair", "Mama") => "sitting"
  case ("bed", "Baby") => "sleeping"
  case _ => "what?"
}

goldilocks(("porridge", "Papa")) should be(
  "eating"
)
goldilocks(("chair", "Mama")) should be(
  "sitting"
)
goldilocks(("porridge", "Cousin")) should be(
  "eating"
)
goldilocks(("beer", "Cousin")) should be(
  "what?"
)