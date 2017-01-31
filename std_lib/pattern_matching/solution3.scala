// Pattern matching can match complex expressions:

def goldilocks(expr: Any) = expr match {
  case ("porridge", "Papa") => "Papa eating porridge"
  case ("porridge", "Mama") => "Mama eating porridge"
  case ("porridge", "Baby") => "Baby eating porridge"
  case _ => "what?"
}

goldilocks(("porridge", "Mama")) should be("Mama eating porridge")