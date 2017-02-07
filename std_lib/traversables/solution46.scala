// :\ or foldRight will combine an operation starting with a seed and combining from the right.
// Fold right is defined as (list :\ seed), where seed is the initial value. Once the fold is established,
// you provide a function that takes two elements. The first is the next element of the list,
// and the second element is the running total of the operation.

//  Given a Traversable (x1, x2, x3, x4), an initial value of init, an operation op,
// foldRight is defined as: x1 op (x2 op (x3 op (x4 op init)))

val list = List(5, 4, 3, 2, 1)
val result = (list :\ 0) {
  (`next element`, `running total`) => `next element` - `running total`
}
result should be(3)

val result2 = list.foldRight(0) {
  (`next element`, `running total`) => `next element` - `running total`
}
result2 should be(3)

val result3 = (list :\ 0)(_ - _) //Short hand
result3 should be(3)

val result4 = list.foldRight(0)(_ - _)
result4 should be(3)

(5 - (4 - (3 - (2 - (1 - 0))))) should be(3)