// Class meta-information can be retrieved by class name by using classOf[className]

classOf[String].getCanonicalName should be("java.lang.String")
classOf[String].getSimpleName should be("String")