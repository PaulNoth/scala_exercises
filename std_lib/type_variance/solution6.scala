// Declaring - indicates contravariance variance. Using - you can apply any container with a certain type to
// a container with a superclass of that type. This is reverse to covariant. In our example,
// we can set a citrus basket to an orange or tangelo basket. Since an orange or tangelo basket
// are a citrus basket. Contravariance is the opposite of covariance:

class MyContainer[-A](a: A)(implicit manifest: scala.reflect.Manifest[A]) { //Can't receive a val because it would be in a covariant position
  def contents = manifest.runtimeClass.getSimpleName
}

val citrusBasket: MyContainer[Citrus] = new MyContainer[Citrus](new Orange)
citrusBasket.contents should be("Citrus")
val orangeBasket: MyContainer[Orange] = new MyContainer[Citrus](new Tangelo)
orangeBasket.contents should be("Citrus")
val tangeloBasket: MyContainer[Tangelo] = new MyContainer[Citrus](new Orange)
tangeloBasket.contents should be("Citrus")
val bananaBasket: MyContainer[Banana] = new MyContainer[Fruit](new Apple)
bananaBasket.contents should be("Fruit")