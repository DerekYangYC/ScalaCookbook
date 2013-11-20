/**
 * 3.9 Assigning the Result of a Match Expression to a Variable
 */
package control

object MatchToVariable extends App{

  //include function in case statement.
  val someNumber = 7
  val evenOrOdd = someNumber match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
  }
  println(evenOrOdd)
  
  //more common way!
  def isTrue(a: Any) = a match {
    case 0 | "" => false
    case _ => true
  }

  println(isTrue("HA")) 
  
}