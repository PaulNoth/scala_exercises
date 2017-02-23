//Transform an optional value with map:

Some(1).map(x => x + 1) shouldBe Some(2)
None.map((x: Int) => x + 1) shouldBe None

Some(1).map(x => x + 1) shouldBe Some(2)
