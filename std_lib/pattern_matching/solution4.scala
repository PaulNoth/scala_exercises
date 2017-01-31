// Pattern matching can wildcard parts of expressions:

def goldilocks(expr: Any) = expr match {
  case ("porridge", _) => "eating"
  case ("chair", "Mama") => "sitting"
  case ("bed", "Baby") => "sleeping"
  case _ => "what?"
}

goldilocks(("porridge", "Papa")) should be("eating")
goldilocks(("chair", "Mama")) should be("sitting")