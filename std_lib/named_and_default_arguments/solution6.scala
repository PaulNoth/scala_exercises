// Default parameters can be functional too

def reduce(a: Int, f: (Int, Int) => Int = _ + _): Int = f(a, a)

reduce(5) should equal(10)
reduce(5, _ * _) should equal(25)