// nonEmpty is pretty self evident too

val map = Map("Phoenix" -> "Arizona", "Austin" -> "Texas")
map.nonEmpty should be(true)

val set = Set()
set.nonEmpty should be(false)