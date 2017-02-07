// foreach will apply a function to all elements of a *Traversable*, but unlike the map function, it will not return anything since the return type is Unit, which is like a void return type in *Java*, *C++*

val list = List(4, 6, 7, 8, 9, 13, 14)
list.foreach(num => println(num * 4))
list should be(List(4, 6, 7, 8, 9, 13, 14))