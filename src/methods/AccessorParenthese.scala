/**
 * 5.6. Forcing Callers to Leave Parentheses off Accessor Methods
 */
package methods

object AccessorParenthese extends App{
	
  class Pizza{
    def crustSize = 12
  }
  
  val p = new Pizza
  //Getter with () is a side effect accessor
//  p.crustSize() //can't compile
  p.crustSize
  
  
}