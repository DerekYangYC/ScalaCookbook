/**
 * 5.3. Setting Default Values for Method Parameters
 */
package methods

object DefaultValues {

  class Connection {
    
	  def makeConnection(conn:String, timeout: Int = 5000, protocol:String  = "http") {
		  println("timeout = %d, protocol = %s".format(timeout, protocol))
		  // more code here
	  }
	  
  }
  

  
}