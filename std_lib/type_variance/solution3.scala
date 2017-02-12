// You can coerce your object to a type.

class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName
}

val fruitBasket: MyContainer[Fruit] = new MyContainer(new Orange())
fruitBasket.contents should be("Fruit")