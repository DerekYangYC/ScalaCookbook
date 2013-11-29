/**
 * 6.6. Creating Static Members with Companion Objects
 */
package objects

object CompanionObjects extends App{

  // Pizza class
  class Pizza(var crustType: String) {
    override def toString = "Crust type is " + crustType
  }
  
  // companion object
  object Pizza {
    val CRUST_TYPE_THIN = "thin"
    val CRUST_TYPE_THICK = "thick"
    def getFoo = "Foo"
  }
  
  println(Pizza.CRUST_TYPE_THICK)
  
  var p =new Pizza(Pizza.CRUST_TYPE_THICK);
  println(p)

}