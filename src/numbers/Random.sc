/**
2.7 Generating Random Numbers
**/
package numbers

object Random {
	val r = scala.util.Random                 //> r  : util.Random.type = scala.util.Random$@509df6f1
	
	//0-49
	r.nextInt(50)                             //> res0: Int = 3
	
	r.nextFloat                               //> res1: Float = 0.14931631

	r.nextPrintableChar                       //> res2: Char = |
	
	var range = 0 to r.nextInt(20)            //> range  : scala.collection.immutable.Range.Inclusive = Range(0, 1, 2)
	//modify numbers
	for(i<-0 to r.nextInt(10)) yield i*2      //> res3: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 2, 4, 6, 8, 10,
                                                  //|  12)
}