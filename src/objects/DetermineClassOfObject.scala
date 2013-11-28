/**
 * 6.3. Determining the Class of an Object
 * call the getClassmethod on the object
 */
package objects

object DetermineClassOfObject extends App{
	
  def printClass(c:Any){println(c.getClass)}
  
  printClass(1)
  
  printClass("haha")
}