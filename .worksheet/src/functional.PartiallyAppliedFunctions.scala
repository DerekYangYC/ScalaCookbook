/**
 * 9.6. Using Partially Applied Functions
 */
package functional

object PartiallyAppliedFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(155); 

  val sum = (a: Int, b: Int, c: Int) => a + b + c;System.out.println("""sum  : (Int, Int, Int) => Int = """ + $show(sum ));$skip(67); 
  
  //f is partially applied function
  val f = sum(1, 2, _: Int);System.out.println("""f  : Int => Int = """ + $show(f ));$skip(10); val res$0 = 
  
  f(3);System.out.println("""res0: Int = """ + $show(res$0))}
}
