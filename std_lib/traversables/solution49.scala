// There are some methods that take much of the folding work out by providing basic functionality. sum will add all the elements, product will multiply, min would determine the smallest element, and max the largest.

val intList = List(5, 4, 3, 2, 1)
intList.sum should be(15)
intList.product should be(120)
intList.max should be(5)
intList.min should be(1)