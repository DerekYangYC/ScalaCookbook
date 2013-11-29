/**
 * 6.8. Creating Object Instances Without Using the new Keyword
 * 1.Create a companion object for your class, and define an apply method in the companion object with the desired constructor signature.
 * 2.Define your class as a case class
 *
 */
package objects

object CreateObjectWithoutNew {

  //Creating a companion object with an apply method
  class Person {
    var name: String = _
  }

  object Person {
    def apply(name: String): Person = {
      var p = new Person
      p.name = name
      p
    }

    //another constructor
    def apply(): Person = {
      var p = new Person
      p.name = "Default"
      p
    }
  }

  val dawn = Person("Dawn")
  val a = Array(Person("Dan"), Person("Elijah"))

  //Declare your class as a case class
  case class Personal(var name: String)

  //it's Personal.apply("HA")
  val psn = Personal("HA")



}