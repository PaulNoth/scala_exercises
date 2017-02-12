// Option.getOrElse can be used to provide a default in the case of None:

val optional: Option[String] = Some("Some Value")
val optional2: Option[String] = None
assert(optional.getOrElse("No Value") === "Some Value", "Should return the value in the option")
assert(optional2.getOrElse("No Value") === "No Value", "Should return the specified default value")