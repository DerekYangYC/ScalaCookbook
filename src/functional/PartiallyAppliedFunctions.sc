/**
 * 9.6. Using Partially Applied Functions
 */
package functional

object PartiallyAppliedFunctions {

  val sum = (a: Int, b: Int, c: Int) => a + b + c //> sum  : (Int, Int, Int) => Int = <function3>
  
  //f is partially applied function
  val f = sum(1, 2, _: Int)                       //> f  : Int => Int = <function1>
  
  f(3)                                            //> res0: Int = 6
}