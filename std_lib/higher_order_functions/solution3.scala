//A closure is a function which maintains a reference to one or more variables
// outside of the function scope (it "closes over" the variables).

var incrementer = 1

def closure = {
  x: Int => x + incrementer
}

val result1 = closure(10)
result1 should be(11)

incrementer = 2

val result2 = closure(10)
result2 should be(12)