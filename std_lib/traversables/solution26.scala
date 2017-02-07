// lastOption will return the last element as an *Option* of an ordered collection, or some random element
// if order is not defined. If a last element is not available, then None is returned:

val list = List(10, 19, 45, 1, 22)
list.lastOption should be(Option(22))

val list2 = List()
list2.lastOption should be(None)