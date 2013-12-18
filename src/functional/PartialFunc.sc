/**
9.8. Creating Partial Functions
useful in collection
*/
package functional

object PartialFunc {
  //throw exception when x=0
  //val divide = (x: Int) => 42 / x
  //divide(0)
  
  val divide = new PartialFunction[Int, Int] {
    def apply(x: Int) = 42 / x
    def isDefinedAt(x: Int) = x != 0
  }                                               //> divide  : PartialFunction[Int,Int] = <function1>

	val divide2: PartialFunction[Int,Int]={
		case d: Int if d!=0 => 42/d
	}                                         //> divide2  : PartialFunction[Int,Int] = <function1>

	divide2.isDefinedAt(2)                    //> res0: Boolean = true

	List(0,1,2).collect{
		divide
	}                                         //> res1: List[Int] = List(42, 21)

}