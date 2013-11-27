/**
 * 4.9 Setting Uninitialized var Field Types
 * In general, define the field as an Option.
 */
package classes

object UninitializedVar extends App {

  case class Address(city: String, state: String, zip: String)
  
  case class Person(var username: String, var password: String) {
    var age = 0
    var name = ""
    var address = None: Option[Address]
  }

  val p = Person("alvinalexander", "secret")
  p.address = Some(Address("Talkeetna", "AK", "99676"))

}