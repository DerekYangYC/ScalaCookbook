/**
 * 9.7. Creating a Function That Returns a Function
 */
package functional

object ReturnFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(316); 

  /**
   * def saySomething(prefix: String): normal method declaration
   * (s: String) => { prefix + " " + s }: anonymous function
   */
  def saySomething(prefix: String) = (s: String) => { prefix + "" + s };System.out.println("""saySomething: (prefix: String)String => String""");$skip(39); 
  val sayHello = saySomething("Hello");System.out.println("""sayHello  : String => String = """ + $show(sayHello ));$skip(17); val res$0 = 
  sayHello("A1");System.out.println("""res0: String = """ + $show(res$0));$skip(393); 

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
  };System.out.println("""greeting2: (language: String)String => Any""");$skip(163); 
  
  def greeting(language:String) = (name: String)=>{
  	language match{
  		case "english" => "Hello, "+name
  		case "spanish" => "Buenos disa, "+name
  	}
  };System.out.println("""greeting: (language: String)String => String""");$skip(37); 
  
  val hello = greeting("english");System.out.println("""hello  : String => String = """ + $show(hello ));$skip(15); val res$1 = 
  hello("You");System.out.println("""res1: String = """ + $show(res$1))}
}
