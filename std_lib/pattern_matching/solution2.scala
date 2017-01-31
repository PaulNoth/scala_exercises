// Pattern matching can return complex somethings:

val stuff = "blue"

val myStuff = stuff match {
  case "red" => (255, 0, 0)
  case "green" => (0, 255, 0)
  case "blue" => (0, 0, 255)
  case _ => println(stuff); 0
}

myStuff should be(0, 0, 255)