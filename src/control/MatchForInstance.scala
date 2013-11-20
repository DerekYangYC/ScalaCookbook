/**
 * 3.14 Using a Match Expression Instead of isInstanceOf
 * to handle more complex cases than if (o.isInstanceOf[Person])
 */
package control

object MatchForInstance extends App{
	
  case class Person(name: String)
  
  def isPerson(x:Any):Boolean = x match{
    case p: Person => true
    case _ => false
  }
  
}