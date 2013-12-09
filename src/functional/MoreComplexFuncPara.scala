/**
 * 9.4. More Complex Functions
 * parameterName: (parameterType(s)) => returnType
 */
package functional


object MoreComplexFuncPara extends App{

  // 1 - define the method
  def executeAndPrint(f:(Int, Int) => Int, x:Int,y:Int){
    val result = f(x,y)
    println(result)
  }
  
  // 2 - define a function to pass in
  val sum = (x:Int,y:Int) => x+y
  val multiply = (x:Int,y:Int) => x*y
  
  // 3 - pass the function and some parameters to the method
  executeAndPrint(sum, 2, 9)
  executeAndPrint(multiply, 2, 9)
}