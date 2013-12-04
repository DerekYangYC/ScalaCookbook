/**
 * 8.3. Using a Trait Like an Abstract Class
 * much more common to use traits than abstract classes to implement base behavior
 * Use an abstract class
 * (a) when you want to define a base behavior, and that behavior requires a constructor with parameters,
 * (b) in some situations when you need to interact with Java
 */
package traits

object LikeAbstractClass {

  trait Pet {
    def speak { println("Yo") } // concrete implementation
    def comeToMaster // abstract method
  }

  class Dog extends Pet {
    // don't need to implement 'speak' if you don't need to
    def comeToMaster { println("I'm coming!") }
  }

  class Cat extends Pet {
    // override the speak method
    override def speak { println("meow") }
    def comeToMaster { println("That's not gonna happen.") }
  }

  //If a class extends a trait without implementing its abstract methods, 
  //it must be definedas abstract.
  abstract class FlyingPet extends Pet {
    def fly { println("I'm flying!") }
  }

}