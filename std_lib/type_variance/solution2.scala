// You can explicitly declare the type variable of the object during instantiation:

class MyContainer[A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName
}

val fruitBasket = new MyContainer[Fruit](new Orange())
fruitBasket.contents should be("Fruit")