def makeUpper(xs: List[String]) = xs map {
  _.toUpperCase
}

def makeWhatEverYouLike(xs: List[String], sideEffect: String => String) = {
  xs map sideEffect
}

makeUpper(List("abc", "xyz", "123")) should be(
  List("ABC", "XYZ", "123")
)

makeWhatEverYouLike(List("ABC", "XYZ", "123"), {
  x => x.toLowerCase
}) should be(
  List("abc", "xyz", "123")
)

//using it inline
List("Scala", "Erlang", "Clojure") map {
  _.length
} should be(
  List(5, 6, 7)
)