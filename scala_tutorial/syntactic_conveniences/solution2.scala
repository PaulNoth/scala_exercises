// After having prefixed the string literal with s you can introduce dynamic values in it with $.
// If you want to splice a complex expression (more than just an identifier), surround it with braces:

def greet(name: String): String =
  s"Hello, ${name.toUpperCase}!"

greet("Scala") shouldBe "Hello, SCALA!"
