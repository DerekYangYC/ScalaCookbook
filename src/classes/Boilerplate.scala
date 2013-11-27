/**
 * 4.14. Generating Boilerplate Code with Case Classes
 * use the case class syntax to generate boilerplate code, including accessor and mutator methods, 
 * along with apply,  unapply,  toString,  equals, and  hashCode  methods, and more.
 */
package classes

object Boilerplate extends App{

  //name and relation are 'val' by default
  case class Person(name: String, relation: String)
  
  //"new" not needed
  val emily = Person("Emily", "niece")
  println(emily.name)

}