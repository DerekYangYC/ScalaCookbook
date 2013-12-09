/**
9.1. Using Function Literals (Anonymous Functions)
*/
package functional

object anonymous {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(125); 
	
	val x = List.range(1, 10);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(42); 
	
	val events = x.filter((i:Int)=>i%2==0);System.out.println("""events  : List[Int] = """ + $show(events ));$skip(34); 
	
	val events2 = x.filter(_%2==0);System.out.println("""events2  : List[Int] = """ + $show(events2 ));$skip(27); 

	x.foreach(i=>println(i));$skip(25); 
	
	x.foreach(println(_))}
}
