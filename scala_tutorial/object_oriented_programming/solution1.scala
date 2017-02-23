// DYNAMIC BINDING

// Object-oriented languages (including Scala) implement dynamic method dispatch.

// This means that the code invoked by a method call depends on the runtime type of the object that contains the method.

Empty contains 1 shouldBe false

new NonEmpty(7, Empty, Empty) contains 7 shouldBe true
