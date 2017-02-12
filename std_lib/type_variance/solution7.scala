// Declaring neither -/+, indicates invariance variance. You cannot use a superclass variable reference
// (\"contravariant\" position) or a subclass variable reference (\"covariant\" position) of that
// type. In our example, this means that if you create a citrus basket you can only reference
// that citrus basket with a citrus variable only.

// Invariance means you need to specify the type exactly:

class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName
}

val citrusBasket: MyContainer[Citrus] = new MyContainer[Citrus](new Orange)
citrusBasket.contents should be("Citrus")