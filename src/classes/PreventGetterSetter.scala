/**
 * 4.7 Preventing Getter and Setter Methods from Being Generated
 * Define the field with the private or private[this]
 */
package classes

object PreventGetterSetter extends App {

  class Stock {
    // getter and setter methods are generated
    var delayedPrice: Double = _

    // a private field can be seen by any Stock instance
    private var price: Double = _

    def setPrice(p: Double) { price = p }
    def isHigher(that: Stock): Boolean = this.price > that.price
  }

  val s1 = new Stock
  s1.setPrice(20)
  val s2 = new Stock
  s2.setPrice(100)
  println(s2.isHigher(s1))

  class Stock2 {
    // a private[this] var is object-private, and can only be seen
    // by the current instance
    private[this] var price: Double = _
    
    def setPrice(p: Double) { price = p }
    
    // error: this method won't compile because price is now object-private
//    def isHigher(that: Stock2): Boolean = this.price > that.price
  }

}