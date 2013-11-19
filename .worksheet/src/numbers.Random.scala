/**
2.7 Generating Random Numbers
**/
package numbers

object Random {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(97); 
	val r = scala.util.Random;System.out.println("""r  : util.Random.type = """ + $show(r ));$skip(25); val res$0 = 
	
	//0-49
	r.nextInt(50);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
	
	r.nextFloat;System.out.println("""res1: Float = """ + $show(res$1));$skip(22); val res$2 = 

	r.nextPrintableChar;System.out.println("""res2: Char = """ + $show(res$2));$skip(34); 
	
	var range = 0 to r.nextInt(20);System.out.println("""range  : scala.collection.immutable.Range.Inclusive = """ + $show(range ));$skip(56); val res$3 = 
	//modify numbers
	for(i<-0 to r.nextInt(10)) yield i*2;System.out.println("""res3: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$3))}
}
