/**
9.1. Using Function Literals (Anonymous Functions)
*/
package functional

object anonymous {
	
	val x = List.range(1, 10)                 //> x  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
	
	val events = x.filter((i:Int)=>i%2==0)    //> events  : List[Int] = List(2, 4, 6, 8)
	
	val events2 = x.filter(_%2==0)            //> events2  : List[Int] = List(2, 4, 6, 8)

	x.foreach(i=>println(i))                  //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
	
	x.foreach(println(_))                     //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
}