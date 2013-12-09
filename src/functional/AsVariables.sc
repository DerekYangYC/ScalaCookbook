/**
 * 9.2. Using Functions as Variables
 */
package functional

object AsVariables {

  val double = (i: Int) => { i * 2 }              //> double  : Int => Int = <function1>
  val list = List.range(1, 5)                     //> list  : List[Int] = List(1, 2, 3, 4)

  list.map(double)                                //> res0: List[Int] = List(2, 4, 6, 8)

  //or using anonymous
  list.map(_ * 2)                                 //> res1: List[Int] = List(2, 4, 6, 8)

  //variable:
  // implicit approach
  val add = (x: Int, y: Int) => { x + y }         //> add  : (Int, Int) => Int = <function2>
  val add2 = (x: Int, y: Int) => x + y            //> add2  : (Int, Int) => Int = <function2>
  // explicit approach
  val add3: (Int, Int) => Int = (x, y) => { x + y }
                                                  //> add3  : (Int, Int) => Int = <function2>
  val add4: (Int, Int) => Int = (x, y) => x + y   //> add4  : (Int, Int) => Int = <function2>

  //method:
  def modMethod(i: Int) = i % 2 == 0              //> modMethod: (i: Int)Boolean
  def modMethod2(i: Int) = { i % 2 == 0 }         //> modMethod2: (i: Int)Boolean
  def modMethod3(i: Int): Boolean = i % 2 == 0    //> modMethod3: (i: Int)Boolean
  def modMethod4(i: Int): Boolean = { i % 2 == 0 }//> modMethod4: (i: Int)Boolean
}