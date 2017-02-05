// Any method which does not require a parameter can be used as a postfix operator:
// a.m can be written a m.

// For instance a.##(b) can be written a ## b and a.! can be written a!

// **Postfix operators** have lower precedence than **infix operators**,
// so: - foo bar baz means foo.bar(baz). - foo bar baz bam means
// (foo.bar(baz)).bam - foo bar baz bam bim means (foo.bar(baz)).bam(bim).

val g: Int = 31
(g toHexString) should be("1f")