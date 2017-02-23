// To splice values into constant String at runtime, you can use string interpolation:

def greet(name: String): String =
  s"Hello, $name!"

greet("Scala") shouldBe "Hello, Scala!"
greet("Functional Programming") shouldBe "Hello, Functional Programming!"
