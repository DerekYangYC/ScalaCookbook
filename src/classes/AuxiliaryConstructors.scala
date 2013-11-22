/**
 * 4.3 Defining Auxiliary Constructors
 * Auxiliary constructors are defined by creating methods named this.
 * Each auxiliary constructor must begin with a call to a previously defined constructor.
 * Each constructor must have a different signature.
 * One constructor calls another constructor with the name this.
 */
package classes

object AuxiliaryConstructors extends App {

  class Pizza(var crustSize: Int, var crustType: String) {

    // one-arg auxiliary constructor
    def this(crustSize: Int) {
      this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
    }
    // one-arg auxiliary constructor
    //    def this(crustType: String) {
    //      this(Pizza.DEFAULT_CRUST_SIZE, crustType)
    //    }
    // zero-arg auxiliary constructor
    def this() {
      this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
    }

    //all of the auxiliary constructors call the primary constructor, but this isn¡¦t necessary; 
    //an auxiliary constructor just needs to call one of the previously defined constructors.
    def this(crustType: String) {
      this(Pizza.DEFAULT_CRUST_SIZE)
      this.crustType = Pizza.DEFAULT_CRUST_TYPE
    }

    override def toString = s"A $crustSize inch pizza with a $crustType crust"

  }

  object Pizza {
    val DEFAULT_CRUST_SIZE = 12
    val DEFAULT_CRUST_TYPE = "THIN"
  }

  val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  val p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
  val p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
  val p4 = new Pizza

  //Apply method for case class!
  case class Person(var name: String, var age: Int)
  // the companion object
  object Person {
    def apply() = new Person("<no name>", 0)
    def apply(name: String) = new Person(name, 0)
  }

  val a = Person() // corresponds to apply()
  val b = Person("Pam") // corresponds to apply(name: String)
  val c = Person("William Shatner", 82)
  println(a)
  println(b)
  println(c)
  // verify the setter methods work
  a.name = "Leonard Nimoy"
  a.age = 82
  println(a)

}