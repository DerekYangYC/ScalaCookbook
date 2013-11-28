/**
 * 5.9. Supporting a Fluent Style of Programming
 * A fluent style of programming lets users of your API write code by chaining method calls together, as in this example:
 *
 * person.setFirstName("Leonard")
 * .setLastName("Nimoy")
 * .setAge(82)
 * .setCity("Los Angeles")
 * .setState("California")
 *
 * this/this.type
 */
package methods

object FluentStyle extends App {

  class Person {
    protected var fname = ""
    protected var lname = ""
    def setFirstName(firstName: String): this.type = {
      fname = firstName
      this
    }

    def setLastName(lastName: String): this.type = {
      lname = lastName
      this
    }
  }

  class Employee extends Person {
    protected var role = ""
    def setRole(role: String): this.type = {
      this.role = role
      this
    }
    override def toString = {
      "%s, %s, %s".format(fname, lname, role)
    }
  }

  val employee = new Employee
  // use the fluent methods
  employee.setFirstName("Al")
    .setLastName("Alexander")
    .setRole("Developer")
  println(employee)

}