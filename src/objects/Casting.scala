/**
 * 6.1. Object Casting
 * asInstanceOf, which is defined in the Scala Any class
 */
package objects

object Casting extends App{
	
	val a = 10
	val b = a.asInstanceOf[Long]
	
	//runtime exception
	val c = b.asInstanceOf[String]
  
}