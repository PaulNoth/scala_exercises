// So, how do we get to set a Fruit basket to an Orange basket? You make it covariant using +.
// This will allow you to set the container to either a variable with the same type or parent type.
// In other words, you can assign MyContainer[Fruit] or MyContainer[Citrus].

class MyContainer[+A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName
}

val fruitBasket: MyContainer[Fruit] = new MyContainer[Orange](new Orange())
fruitBasket.contents should be("Orange")