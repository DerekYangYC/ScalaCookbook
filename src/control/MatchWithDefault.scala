/**
 * 3.10 Accessing the Value of the Default Case in a Match Expression
 * Besides _ and default keyword
 */
package control

object MatchWithDefault extends App {

  val i = 9
  i match {
    case 0 => println("1")
    case 1 => println("2")
    case whoa => println("You gave me: " + whoa)
  }

}