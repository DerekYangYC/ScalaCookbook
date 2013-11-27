/**
 * 4.15. Defining an equals Method (Object Equality)
 */
package classes

object ObjectEquality extends App {

  class Person(name: String, age: Int) {
    def canEqual(a: Any) = a.isInstanceOf[Person]

    override def equals(that: Any): Boolean = that match {
      case that: Person => that.canEqual(this) && this.hashCode() == that.hashCode()
      case _ => false
    }

    override def hashCode: Int = {
      val prime = 31
      var result = 1
      result = prime * result + age;
      result = prime * result + (if (name == null) 0 else name.hashCode)
      return result
    }
  }

  //
  class Employee(name: String, age: Int, var role: String) extends Person(name, age) {

    override def canEqual(a: Any) = a.isInstanceOf[Employee]

    override def equals(that: Any): Boolean = that match {
      case that: Employee =>
        that.canEqual(this) && this.hashCode == that.hashCode
      case _ => false
    }

    override def hashCode: Int = {
      val ourHash = if (role == null) 0 else role.hashCode
      super.hashCode + ourHash
    }

  }

}