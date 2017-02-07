// headOption will return the first element as an *Option* of an ordered collection, or some random element if order is not defined. If a first element is not available, then *None* is returned.

val list = List(10, 19, 45, 1, 22)
list.headOption should be(Option(10))

val list2 = List()
list2.headOption should be(None)