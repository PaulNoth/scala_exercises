// None can be cast Any, AnyRef or AnyVal

None.asInstanceOf[Any] === None shouldBe true

None.asInstanceOf[AnyRef] === None shouldBe true

None.asInstanceOf[AnyVal] === None shouldBe true
