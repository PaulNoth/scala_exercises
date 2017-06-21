val head = List(1, 3)
val tail = List(5, 7)

head ::: tail should be(
  List(1, 3, 5, 7)
)
head ::: Nil should be(
  List(1,3)
)