// /: or foldLeft will combine an operation starting with a seed and combining from the left.
// *Fold Left* is defined as (seed /: list), where seed is the initial value. Once the fold is established,
// you provide a function that takes two arguments. The first argument is the running total of the operation,
// and the second element is the next element of the list.

//  Given a Traversable (x1, x2, x3, x4), an initial value of init, an operation op, foldLeft is defined as: (((init op x1) op x2) op x3) op x4)

val list = List(5, 4, 3, 2, 1)
val result = (0 /: list) {
  (`running total`, `next element`) => `running total` - `next element`
}
result should be(-15)

val result2 = list.foldLeft(0) {
  (`running total`, `next element`) => `running total` - `next element`
}
result2 should be(-15)

val result3 = (0 /: list)(_ - _) //Short hand
result3 should be(-15)

val result4 = list.foldLeft(0)(_ - _)
result4 should be(-15)

(((((0 - 5) - 4) - 3) - 2) - 1) should be(-15)