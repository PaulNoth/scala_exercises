// Filter values with filter:

Some(1).filter(x => x % 2 == 0) shouldBe None
Some(2).filter(x => x % 2 == 0) shouldBe Some(2)

Some(1).filter(x => x % 2 == 0) shouldBe None
