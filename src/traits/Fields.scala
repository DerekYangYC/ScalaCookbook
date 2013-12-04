/**
 * 8.2. Using Abstract and Concrete Fields in Traits
 */
package traits

object Fields extends App {

  trait PizzaTrait {
    var numToppings: Int // abstract
    var size = 14 // concrete
    val maxNumToppings = 10 // concrete
  }

  class Pizza extends PizzaTrait {
    var numToppings = 0 // 'override' not needed
    size = 16 // 'var' and 'override' not needed
  }

  trait PizzaTrait2 {
    val minNumToppings: Int
  }

  class Pizza2 extends PizzaTrait2 {
    override val minNumToppings = 10 // 'override' is required
  }
  
}