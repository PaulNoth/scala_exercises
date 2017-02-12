// None can be used with Option instead of null references

val optional: Option[String] = None
assert(optional.isEmpty === true)
assert(optional === None)