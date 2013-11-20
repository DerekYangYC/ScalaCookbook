/**
 * 3.12 Using Case Classes in Match Expressions
 * 
 */
package control

trait Animal
case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal
case object Woodpecker extends Animal

object MatchClasses extends App {

  def determineType(x: Animal): String = x match {
//    case Dog(moniker) => "Got a Dog, name = " + moniker
    //or
    case d @ Dog("Rocky") => "Got a Dog, name = "+ d.name
    case _: Cat => "Got a Cat (ignoring the name)"
    case Woodpecker => "That was a Woodpecker"
    case _ => "That was something else"
  }

  println(determineType(new Dog("Rocky")))
  println(determineType(new Cat("Rusty the Cat")))
  println(determineType(Woodpecker))

}