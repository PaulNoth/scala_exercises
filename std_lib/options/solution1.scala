val someValue: Option[String] = Some("I am wrapped in something")
someValue should be(Some("I am wrapped in something"))

val emptyValue: Option[String] = None
emptyValue should be(None)
