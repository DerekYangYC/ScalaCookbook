/**
 * 5.8  Declaring That a Method Can Throw an Exception
 * Use the @throwsannotation to declare the exception(s) that can be thrown
 */
package methods

object MethodThrowsException {
  
  @throws(classOf[Exception])
  def play {
    // exception throwing code here ...
  }
  
}