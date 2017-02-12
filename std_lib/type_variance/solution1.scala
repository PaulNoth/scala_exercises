// A traditional objection to static typing is that it has much syntactic overhead. Scala alleviates this
// by providing *type inference*.
// The classic method for type inference in functional programming languages is *Hindley-Milner*,
// and it was first employed in ML.
// Scala's type inference system works a little differently, but it's similar in spirit:
// infer constraints, and attempt to unify a type.

// Using type inference the type that you instantiate it will be the val or var reference type:

class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName
}

val fruitBasket = new MyContainer(new Orange())
fruitBasket.contents should be("Orange")