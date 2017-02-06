// You can filter any sequence based on a predicate:

val s = Seq("hello", "to", "you")
val filtered = s.filter(_.length > 2)
filtered should be(Seq("hello", "you"))