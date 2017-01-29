def lambda = (x: Int) => x + 1
def result = lambda(5)
result should be(6)