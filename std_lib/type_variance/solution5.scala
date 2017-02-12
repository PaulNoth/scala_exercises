// The problem with covariance is that you can't mutate, set or change the object since it has to guarantee
// that what you put into it is a valid type. In other words the reference is a fruit basket, but we still have
// to make sure that no other fruit can be placed in our orange basket:

class MyContainer[+A](val a: A)(implicit manifest: scala.reflect.Manifest[A]) {
  def contents = manifest.runtimeClass.getSimpleName
}

val fruitBasket: MyContainer[Fruit] = new MyContainer[Orange](new Orange())
fruitBasket.contents should be("Orange")

class NavelOrange extends Orange //Creating a subtype to prove a point
val navelOrangeBasket: MyContainer[NavelOrange] = new MyContainer[Orange](new Orange()) //Bad!
val tangeloBasket: MyContainer[Tangelo] = new MyContainer[Orange](new Orange()) //Bad!