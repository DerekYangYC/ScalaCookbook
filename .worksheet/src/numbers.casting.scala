/**
2.2 Converting Between Numeric Type(Casting)

**/
package numbers

object Casting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); val res$0 = 
	
	19.45.toInt;System.out.println("""res0: Int = """ + $show(res$0));$skip(12); val res$1 = 
	19.toFloat;System.out.println("""res1: Float = """ + $show(res$1));$skip(13); val res$2 = 
	19.toDouble;System.out.println("""res2: Double = """ + $show(res$2));$skip(11); val res$3 = 
	19.toLong;System.out.println("""res3: Long = """ + $show(res$3));$skip(24); 
	
	val b = 1945.toFloat;System.out.println("""b  : Float = """ + $show(b ));$skip(112); 
	
	//isValidmethods to test whether the type can be converted before attempting the conversion
	
	val a = 1000L;System.out.println("""a  : Long = """ + $show(a ));$skip(15); val res$4 = 
	a.isValidByte;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(16); val res$5 = 
	a.isValidShort;System.out.println("""res5: Boolean = """ + $show(res$5))}
	
}
