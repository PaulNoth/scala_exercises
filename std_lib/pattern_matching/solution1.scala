// Pattern matching returns something:

val stuff = "blue"

val myStuff = stuff match {
  case "red" =>
    println("RED"); 1
  case "blue" =>
    println("BLUE"); 2
  case "green" =>
    println("GREEN"); 3
  case _ => println(stuff); 0 //case _ will trigger if all other cases fail.
}

myStuff should be(2)