/**
 * 9.5. Using Closures
 * a closure (also lexical closure or function closure) is a function
 * together with a referencing environment for the non-local variables of that function.
 * A closure allows a function to access variables outside its immediate lexical scope
 *
 *  to create a closure in Scala, just define a function
 *  that refers to a variable that’s in the same scope as its declaration
 */
package functional

import scala.collection.mutable.ArrayBuffer

object Closures extends App {
  //
  var hello = "Hello"
  def sayHello(name: String) { println(s"$hello, $name") }

  val foo = new Foo
  foo.exec(sayHello, "Al")

  hello = "Hela"
  foo.exec(sayHello, "Lerenzo")
  
  /**
   * Take advantage of closure technique, insted of:
   * val isOfVotingAge = (age: Int) => age >= 18
   * You can now pass isOfVotingAgearound to other methods and functions
   */
  var votingAge = 18
  val isOfVotingAge = (age:Int) => age>=votingAge
  
  println(isOfVotingAge(20))
  votingAge = 21
  println(isOfVotingAge(20))

  
  /**
   * Closures with other data types
   * 
   */
  val fruits = ArrayBuffer("Apple")
  
  // the function addToBasket has a reference to fruits
  val addToBasket = (s:String)=>{
    fruits += s
    println(fruits.mkString(","))
  }
  
}

class Foo {

  def exec(f: (String) => Unit, name: String) {
    f(name)
  }

}