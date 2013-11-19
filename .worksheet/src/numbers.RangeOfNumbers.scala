/**
2.8 Creating a Range, List or Array of Numbers
**/
package numbers

object RangeOfNumbers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 
	val r = 1 to 10;System.out.println("""r  : scala.collection.immutable.Range.Inclusive = """ + $show(r ));$skip(23); 
  val s = 1 to 10 by 2;System.out.println("""s  : scala.collection.immutable.Range = """ + $show(s ));$skip(65); 
	
	//infix notation(should be 1.to(10))
	val a = 1 to 10 toArray;System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(24); 
	val l = 1 to 10 toList;System.out.println("""l  : List[Int] = """ + $show(l ));$skip(45); 
	
	//preferable:
	val aa = (1 to 10).toArray;System.out.println("""aa  : Array[Int] = """ + $show(aa ));$skip(27); 
	val ll = (1 to 10).toList;System.out.println("""ll  : List[Int] = """ + $show(ll ))}
	
}
