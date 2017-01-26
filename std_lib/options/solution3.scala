val value1 = maybeItWillReturnSomething(true)
val value2 = maybeItWillReturnSomething(false)

value1.isEmpty should be(false)
value2.isEmpty should be(true)

