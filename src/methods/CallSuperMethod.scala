/**
 * 5.2. Calling a Method on a Superclass
 * use super
 * super[traitName].methodNamesyntax.
 */
package methods

object CallSuperMethod extends App {

  //Controlling which trait you call a method from
  trait Human {
    def hello = "the Human trait"
  }

  trait Mother extends Human {
    override def hello = "Mother"
  }

  trait Father extends Human {
    override def hello = "Father"
  }

  class Child extends Human with Mother with Father {
    def printSuper = super.hello
    def printMother = super[Mother].hello
    def printFather = super[Father].hello
    def printHuman = super[Human].hello
  }

  val c = new Child
  println(s"c.printSuper = ${c.printSuper}")
  println(s"c.printMother = ${c.printMother}")
  println(s"c.printFather = ${c.printFather}")
  println(s"c.printHuman = ${c.printHuman}")

  // can't continue to reach up through the parent class hierarchy
  trait Animal {
    def walk { println("Animal is walking") }
  }
  
  class FourLeggedAnimal extends Animal {
    override def walk { println("I'm walking on all fours") }
  }
  
  class Dog extends FourLeggedAnimal {
    def walkThenRun {
      super.walk // works
      super[FourLeggedAnimal].walk // works
      //      super[Animal].walk // error: won't compile
    }
  }
  
  
}