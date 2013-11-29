/**
 * 7.6. Using Import Statements Anywhere
 */
package packaging

object ImportAnywhere {

  def printRandom {
    {
      import scala.util.Random
      val r1 = new Random // this is fine
    }
//    val r2 = new Random // error: not found: type Random
  }
}