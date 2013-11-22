/**
 * 4.5 Providing Default Values for Constructor Parameters
 * a powerful feature that can eliminate the need for auxiliary constructors
 */
package classes

object DefaultValueForConstructor extends App {

  class Socket(val timeout: Int = 1000, val linger: Int = 2000) {
    override def toString = s"timeout: $timeout, linger: $linger"
  }

  println(new Socket)
  println(new Socket(3000))
  println(new Socket(300, 400))

  //use named parameters
  println(new Socket(timeout = 3000, linger = 4000))
  println(new Socket(linger = 4000, timeout = 3000))
  println(new Socket(timeout = 3000))
  println(new Socket(linger = 4000))

}