/**
2.5 Comparing Floating-Point Numbers
Like Java, needs approximately equal
**/
package numbers

object CompareFloatNumbers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(229); 
	
	def ~=(x: Double, y: Double, precision: Double) = {
		if((x-y).abs < precision) true else false
	};System.out.println("""~= : (x: Double, y: Double, precision: Double)Boolean""");$skip(15); 
	
	val a = 0.3;System.out.println("""a  : Double = """ + $show(a ));$skip(19); 
	
	val b = 0.1+0.2;System.out.println("""b  : Double = """ + $show(b ));$skip(28); 
	
	
	println(~=(a,b,0.001))}
}
