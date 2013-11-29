/**
 * 6.7. Putting Common Code in Package Objects
 */
package object objects {
  
  // field
  val MAGIC_NUM = 42

  // method
  def echo(a: Any) { println(a) }
  
  // enumeration
  object Margin extends Enumeration {
    type Margin = Value
    val TOP, BOTTOM, LEFT, RIGHT = Value
  }
  
  // type definition
  type MutableMap[K, V] = scala.collection.mutable.Map[K, V]
  val MutableMap = scala.collection.mutable.Map

}