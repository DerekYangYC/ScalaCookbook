/**
2.8 Creating a Range, List or Array of Numbers
**/
package numbers

object RangeOfNumbers {
	val r = 1 to 10                           //> r  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7,
                                                  //|  8, 9, 10)
  val s = 1 to 10 by 2                            //> s  : scala.collection.immutable.Range = Range(1, 3, 5, 7, 9)
	
	//infix notation(should be 1.to(10))
	val a = 1 to 10 toArray                   //> a  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	val l = 1 to 10 toList                    //> l  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	//preferable:
	val aa = (1 to 10).toArray                //> aa  : Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	val ll = (1 to 10).toList                 //> ll  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
}