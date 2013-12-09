/**
*9.3. Defining a Method That Accepts a Simple Function Parameter
* defining a function as a method : parameterName: (parameterType(s)) => returnType
*/
package functional

object FunctionParameter {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(261); 
	
	def executeFunction(callback:()=>Unit){
		callback()
	};System.out.println("""executeFunction: (callback: () => Unit)Unit""");$skip(42); 
	
	val sayHello = () =>{println("Hello")};System.out.println("""sayHello  : () => Unit = """ + $show(sayHello ));$skip(30); 
	
	executeFunction(sayHello);}
	
}
