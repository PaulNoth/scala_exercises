// Use flatMap to transform a successful value into an optional value:

Some(1).flatMap(x => Some(x + 1)) shouldBe Some(2)
None.flatMap((x: Int) => Some(x + 1)) shouldBe None

Some(1).flatMap(x => Some(x + 1)) shouldBe Some(2)
