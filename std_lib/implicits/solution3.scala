// Implicits can be used to automatically convert a value's type to another:

import java.math.BigInteger
implicit def Int2BigIntegerConvert(value: Int): BigInteger = new BigInteger(value.toString)

def add(a: BigInteger, b: BigInteger) = a.add(b)

add(Int2BigIntegerConvert(3), Int2BigIntegerConvert(6)) == Int2BigIntegerConvert(9) should be(true)

add(3, 6) == 9 should be(false)
add(3, 6) == Int2BigIntegerConvert(9) should be(true)

add(3, 6) == (9: BigInteger) should be(true)
add(3, 6).intValue == 9 should be(true)