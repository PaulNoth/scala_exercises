// You can map values in a sequence through a function:

val s = Seq("hello", "world")
val r = s map {
  _.reverse
}

r should be(List("olleh", "dlrow"))