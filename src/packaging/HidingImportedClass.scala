/**
 * 7.4. Hiding a Class During the Import Process
 * 
 */
package packaging

//second _character inside the curly braces is the same as stating that you want to import everything else in the package
import java.util.{Random => _, _}

object HidingImportedClass {
  
//  can't not compile because Random is hidden	
//  val r = new Random
  
}