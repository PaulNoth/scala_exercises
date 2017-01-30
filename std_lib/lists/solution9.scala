val a = List(1, 2, 3)

a.map {
  _ * 2
} should equal(List(2, 4, 6))

a.filter {
  _ % 2 == 0
} should equal(List(2))