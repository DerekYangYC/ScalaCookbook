/**
 * 4.11 Calling a Superclass Constructor
 *  you can control the superclass constructor that¡¦s called by the primary constructor in a subclass,
 *  but you  can¡¦t  control the superclass constructor that¡¦s called by an auxiliary constructor in the subclass
 */
package classes

object SuperConstructor {

  case class Address(city: String, state: String)
  case class Role(role: String)

  class Person(var name: String, var address: Address) {

    // no way for Employee auxiliary constructors to call this constructor
    def this(name: String) {
      this(name, null)
      address = null
    }
    override def toString = if (address == null) name else s"$name @ $address"
  }

  class Employee(name: String, role: Role, address: Address) extends Person(name, address) {

    def this(name: String) {
      this(name, null, null)
    }

    def this(name: String, role: Role) {
      this(name, role, null)
    }
    def this(name: String, address: Address) {
      this(name, null, address)
    }
  }

}