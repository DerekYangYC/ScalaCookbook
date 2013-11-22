/**
 * 4.1 Creating a Primary Constructor
 *The constructor parameters
 *Methods that are called in the body of the class
 *Statements and expressions that are executed in the body of the class
 */
package classes

object PrimaryConstructor extends App{

  //var fields are variable or mutable. Scala generates both getter and setter
  class Person(var firstName: String, var lastName: String) {

    println("the constructor begins");

    //private val, which is like making it private and final
    private val HOME = System.getProperty("user.home")
    var age = 0

    override def toString = s"$firstName $lastName is $age years old"
    def printHome { println(s"HOME = $HOME") }
    def printFullName { println(this) } // uses toString
    
    
    printHome
    printFullName
    println("still in the constructor")

  }

  val p = new Person("Adam", "Meyer");
  
  //implicitly compile to p.firstName_$eq
  p.firstName = "Ha"
  p.lastName = "Ga"
  p.age = 90
  println(p.toString)
    
}