// Lists have many useful methods

val a = List(1, 3, 5, 7, 9)

// get the length of the list
a.length should equal(5)

// reverse the list
a.reverse should equal(List(9, 7, 5, 3, 1))

// map a function to double the numbers over the list
a.map { v => v * 2 } should equal(List(2, 6, 10, 14, 18))

// filter any values divisible by 3 in the list
a.filter { v => v % 3 == 0 } should equal(List(3, 9))