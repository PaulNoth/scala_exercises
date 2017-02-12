// Some is the opposite of None for Option types

val optional: Option[String] = Some("Some Value")
assert((optional == None) === false, "Some(value) should not equal None")
assert(optional.isEmpty === false, "Some(value) should not be empty")