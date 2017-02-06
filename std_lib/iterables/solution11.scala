// sameElements will return true if the two iterables produce the same elements in the same order:

val xs = List("Manny", "Moe", "Jack")
val ys = List("Manny", "Moe", "Jack")
(xs sameElements ys) should be(true)

val xt = List("Manny", "Moe", "Jack")
val yt = List("Manny", "Jack", "Moe")
(xt sameElements yt) should be(false)

val xs1 = Set(3, 2, 1, 4, 5, 6, 7)
val ys1 = Set(7, 2, 1, 4, 5, 6, 3)
(xs1 sameElements ys1) should be(true)

val xt1 = Set(1, 2, 3)
val yt1 = Set(3, 2, 1)
(xt1 sameElements yt1) should be(false)