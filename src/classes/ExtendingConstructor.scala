/**
 * 4.10 Handling Constructor Parameters When Extending a Class
 */
package classes

object ExtendingConstructor {
	
  case class Address(city: String, state:String)
  
  class Person(var name: String, var address: Address){
    override def toString = if(address==null) name else s"$name @ $address"
  }
  
  
  //leave the var declaration off of name&address fields, but age is new, so declare it as a var
  class Employee(name: String, address:Address, var age: Int) extends Person(name,address){
    //rest
  }
  
  
  
}