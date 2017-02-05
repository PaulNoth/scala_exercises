// For expressions can nest, with later generators varying more rapidly than earlier ones:

val xValues = 1 to 4
val yValues = 1 to 2
val coordinates = for {
  x <- xValues
  y <- yValues
} yield (x, y)
coordinates(4) should be(3, 1)