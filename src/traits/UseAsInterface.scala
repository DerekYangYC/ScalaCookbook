/**
 * 8.1. Using a Trait as an Interface
 * When a class extends multiple traits, use extends  for the first trait,
 * and withfor sub‐sequent traits:
 * class Foo extends Trait1 with Trait2 with Trait3 with Trait4 { ...
 */
package traits

object UseAsInterface extends App {

  trait BaseSoundPlayer {
    def play
    def close
    def pause
    def stop
    def resume
  }

  trait Dog {
    def speak(whatToSay: String)
    def wagTail(enable: Boolean)
  }

  /**Unless the class implementing a trait is abstract, 
   * it must implement all of the abstracttrait methods:
   */
  class Mp3SoundPlayer extends BaseSoundPlayer {
    def play { /* code here ...*/ }
    def close { /* code here ...*/ }
    def pause { /* code here ...*/ }
    def stop { /* code here ...*/ }
    def resume { /* code here ...*/ }
  }

}