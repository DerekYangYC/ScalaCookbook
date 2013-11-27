/**
 * 4.13. Defining Properties in an Abstract Base Class (or Trait)
 * You can declare both val and var fields in an abstract class (or trait), and those fields
 * can be abstract or have concrete implementations.
 */
package classes

object AbstractField extends App {

  abstract class Pet(name: String) {
    val greeting: String
    var age: Int
    def sayHello { println(greeting) }
    override def toString = s"I say $greeting, and I'm $age"
  }

  class Dog(name: String) extends Pet(name) {
    val greeting = "Woof"
    var age = 2
  }
  class Cat(name: String) extends Pet(name) {
    val greeting = "Meow"
    var age = 5
  }

  val dog = new Dog("Fido")
  val cat = new Cat("Morris")
  dog.sayHello
  cat.sayHello
  println(dog)
  println(cat)

  // verify that the age can be changed
  cat.age = 10
  println(cat)

}