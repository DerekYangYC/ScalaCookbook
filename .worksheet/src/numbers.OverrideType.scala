/**
2.3 Overriding the Default Number Type
var [name]:[Type] = [initial value]
**/
package numbers

object OverrideType {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(134); 
	
	val a = 1;System.out.println("""a  : Int = """ + $show(a ));$skip(36); 
	
	//one way to override
	val b =1d;System.out.println("""b  : Double = """ + $show(b ));$skip(12); 
	val c = 1f;System.out.println("""c  : Float = """ + $show(c ));$skip(14); 
	val d = 100L;System.out.println("""d  : Long = """ + $show(d ));$skip(33); 
	
	//another way
	val e = 0:Byte;System.out.println("""e  : Byte = """ + $show(e ));$skip(15); 
	val f = 0:Int;System.out.println("""f  : Int = """ + $show(f ));$skip(18); 
	val g = 0:Double;System.out.println("""g  : Double = """ + $show(g ));$skip(32); 
	
	
	//prefer
	val h:Double = 1;System.out.println("""h  : Double = """ + $show(h ));$skip(35); 
	
	
	//ascription
	val s = "Dave";System.out.println("""s  : String = """ + $show(s ));$skip(19); 
	val p = s: Object;System.out.println("""p  : Object = """ + $show(p ))}
	
}
