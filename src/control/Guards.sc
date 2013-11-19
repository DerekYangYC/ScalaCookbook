/**
3.3 Using a For Loop with Embedded If statements (Guards)
**/

package control

object Guards {
	
	for(i <- 1 to 10 if i%2==0) println(i)    //> 2
                                                  //| 4
                                                  //| 6
                                                  //| 8
                                                  //| 10
  for{
  	i <- 1 to 10
  	if i>3
  	if i<6
  	if i%2 ==0
  } println(i)                                    //> 4
	
}