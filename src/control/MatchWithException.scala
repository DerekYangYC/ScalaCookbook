/**
 * 3.16 Matching One or More Exceptions with try/catch
 */
package control

object MatchWithException extends App {

  
  def toInt(s: String): Option[Int] =
    try {
      Some(s.toInt)
    } catch {
      case e: Exception => throw e
    }

  //specific exception
  @throws(classOf[NumberFormatException])
  def toInt2(s: String): Option[Int] =
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => throw e
    }

}