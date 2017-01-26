// Option can also be used with pattern matching

val someValue: Option[Double] = Some(20.0)
val value = someValue match {
  case Some(v) => v
  case None => 0.0
}

value should be(20.0)
val noValue: Option[Double] = None
val value1 = noValue match {
  case Some(v) ⇒ v
  case None ⇒ 0.0
}
value1 should be(0.0)
