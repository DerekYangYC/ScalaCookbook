/**
*9.3. Defining a Method That Accepts a Simple Function Parameter
* defining a function as a method : parameterName: (parameterType(s)) => returnType
*/
package functional

object FunctionParameter {
	
	def executeFunction(callback:()=>Unit){
		callback()
	}                                         //> executeFunction: (callback: () => Unit)Unit
	
	val sayHello = () =>{println("Hello")}    //> sayHello  : () => Unit = <function0>
	
	executeFunction(sayHello);                //> Hello
	
}