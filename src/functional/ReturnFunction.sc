/**
 * 9.7. Creating a Function That Returns a Function
 */
package functional

object ReturnFunction {

  /**
   * def saySomething(prefix: String): normal method declaration
   * (s: String) => { prefix + " " + s }: anonymous function
   */
  def saySomething(prefix: String) = (s: String) => { prefix + "" + s }
                                                  //> saySomething: (prefix: String)String => String
  val sayHello = saySomething("Hello")            //> sayHello  : String => String = <function1>
  sayHello("A1")                                  //> res0: String = HelloA1

  def greeting2(language: String) = (name: String) => {
    val english = () => "Hello, " + name
    val spanish = () => "Buenos dias, " + name
    language match {
      case "english" => println("")
      case "english" =>
        println("returning 'english' function")
        english()
      case "spanish" =>
        println("returning 'spanish' function")
        spanish()
    }
  }                                               //> greeting2: (language: String)String => Any
  
  def greeting(language:String) = (name: String)=>{
  	language match{
  		case "english" => "Hello, "+name
  		case "spanish" => "Buenos disa, "+name
  	}
  }                                               //> greeting: (language: String)String => String
  
  val hello = greeting("english")                 //> hello  : String => String = <function1>
  hello("You")                                    //> res1: String = Hello, You
}