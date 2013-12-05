/**
 * 8.7. Ensuring a Trait Can Only Be Added to a Type That Has a Specific Method
 */
package traits

object SpecificMethods {

  trait WarpCore {
    this: { def ejectWarpCore(password: String): Boolean 
    //multiple methods:
    //def start:Unit
    } =>
  }

  class Starship {}

  class Enterprise extends Starship with WarpCore {
    def ejectWarpCore(password: String): Boolean = {
      if (password == "password") {
        println("ejecting core")
        true
      } else {
        false
      }
    }
  }
  
  
  
  
}