/**
 * 8.4. Using Traits as Simple Mixins
 */
package traits

object SimpleMixins extends App {

  trait Tail {
    def wagTail { println("tail is wagging") }
    def stopTail { println("tail is stopped") }
  }

  abstract class Pet(var name: String) {
    def speak // abstract
    def ownerIsHome { println("excited") }
    def jumpForJoy { println("jumping for joy") }
  }

  class Dog(name: String) extends Pet(name) with Tail {
    def speak { println("woof") }
    override def ownerIsHome {
      wagTail
      speak
    }
  }

  /**The Dog class extends the abstract class Pet and mixes in the Tail  trait, 
   * and can use the methods defined by both Petand Tail:
   */
  val zeus = new Dog("Zeus")
  zeus.ownerIsHome
  zeus.jumpForJoy

}