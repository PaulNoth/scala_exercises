// Class meta-information can be derived from an object reference using getClass()

val zoom = "zoom"
zoom.isInstanceOf[String] should be(true)
zoom.getClass.getCanonicalName should be("java.lang.String")
zoom.getClass.getSimpleName should be("String")