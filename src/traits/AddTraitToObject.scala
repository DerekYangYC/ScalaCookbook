/**
 * 8.8. Adding a Trait to an Object Instance
 * Add the trait to the object when you construct it
 */
package traits

object AddTraitToObject extends App {
  val hulk = new DavidBanner with Angry

  //As a more practical matter, you might mix in something like a debugger or logging trait
  //when constructing an object to help debug that object
  // no debugger
  val child = new Child
  // debugger added as the object is created
  val problemChild = new ProblemChild with Debugger
}

trait Angry {
  println("you won't like me")
}

class DavidBanner

class Child
class ProblemChild

trait Debugger {
  def log(message: String) {
    // do something with message
  }
}

