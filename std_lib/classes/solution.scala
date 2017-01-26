class ClassWithValParameter(val name: String)

val aClass = new ClassWithValParameter("Gandalf")
aClass.name should be("Gandalf")
