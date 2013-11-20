/**
 * 3.18 Creating Your Own Control Structures
 *
 */
package control

object OwnControl extends App {

  //: =>
  def doubleif(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit) {
    if (test1 && test2) {
      codeBlock
    }
  }
  
  val age = 30
  val numAccidents =0
  doubleif(age > 18)(numAccidents == 0) { println("Discount!") }
  
}