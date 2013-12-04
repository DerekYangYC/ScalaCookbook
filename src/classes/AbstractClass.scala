/**
 * 4.12 When to Use An Abstract Class
 * You want to create a base class that requires constructor arguments.
 * The code will be called from Java code.
 * 
 * Because a class can extend only one abstract class, when you��re trying to decide whether to use a trait or abstract class, 
 * always use a trait,
 */
package classes

object AbstractClass {

  abstract class BaseController(db: String) {
    def save { 
      //save 
    }
    def update { 
      //update 
    }
    def delete { 
      //delete 
    }
   
    // abstract. don't need abstract keyword!
    def connect
    // an abstract method that returns a String
    def getStatus: String
    // an abstract method that takes a parameter
    def setServerName(serverName: String)
  }

}