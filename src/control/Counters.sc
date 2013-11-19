/**
3.2 Using for Loops with Multiple Counters
**/
package control

object Counters {
	
	for{
		i <- 1 to 3 //generator!
		j <- 1 to 2
		k <- 1 to 4
	}println(s"i = $i, j = $j, k = $k")       //> i = 1, j = 1, k = 1
                                                  //| i = 1, j = 1, k = 2
                                                  //| i = 1, j = 1, k = 3
                                                  //| i = 1, j = 1, k = 4
                                                  //| i = 1, j = 2, k = 1
                                                  //| i = 1, j = 2, k = 2
                                                  //| i = 1, j = 2, k = 3
                                                  //| i = 1, j = 2, k = 4
                                                  //| i = 2, j = 1, k = 1
                                                  //| i = 2, j = 1, k = 2
                                                  //| i = 2, j = 1, k = 3
                                                  //| i = 2, j = 1, k = 4
                                                  //| i = 2, j = 2, k = 1
                                                  //| i = 2, j = 2, k = 2
                                                  //| i = 2, j = 2, k = 3
                                                  //| i = 2, j = 2, k = 4
                                                  //| i = 3, j = 1, k = 1
                                                  //| i = 3, j = 1, k = 2
                                                  //| i = 3, j = 1, k = 3
                                                  //| i = 3, j = 1, k = 4
                                                  //| i = 3, j = 2, k = 1
                                                  //| i = 3, j = 2, k = 2
                                                  //| i = 3, j = 2, k = 3
                                                  //| i = 3, j = 2, k = 4
	
	
}