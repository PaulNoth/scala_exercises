// Lists are immutable

val a = List(1, 3, 5, 7, 9)
val b = a.filterNot(v ⇒ v == 5) // remove where value is 5

a should equal(List(1, 3, 5, 7, 9))
b should equal(List(1, 3, 7, 9))