/**
 * 3.7 Using a Match Expression Like a switch Statement
 * Using @switch to optimize
 *
 */
package control

import scala.annotation.switch

object MatchExpression extends App {

  val i = 2

  val m = i match {
    case 1 => "A"
    case 2 => "B"
    case 3 => "C"
    case _ => "Invalid"
  }

  println(m)

  //use @switch to compiled to a tableswitch or lookupswitch to make better performance
  val x = (i: @switch) match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Other"
  }

  //use match for other types
  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case _ => "Unknown"
  }

  println(getClassAsString("123"))
  println(getClassAsString(123))
}