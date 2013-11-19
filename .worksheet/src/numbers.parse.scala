/**
2.1 Parsing a Number From a String
Char
Byte
Short
Int
Long
Float
Double
**/

package numbers

object Parse {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(127); val res$0 = 
  "100".toInt;System.out.println("""res0: Int = """ + $show(res$0));$skip(17); val res$1 = 
  "100".toDouble;System.out.println("""res1: Double = """ + $show(res$1));$skip(16); val res$2 = 
  "100".toFloat;System.out.println("""res2: Float = """ + $show(res$2));$skip(13); val res$3 = 
  "1".toLong;System.out.println("""res3: Long = """ + $show(res$3));$skip(14); val res$4 = 
  "1".toShort;System.out.println("""res4: Short = """ + $show(res$4));$skip(13); val res$5 = 
  "1".toByte;System.out.println("""res5: Byte = """ + $show(res$5));$skip(41); 
  
  //"foo".toInt
  val b = BigInt("1");System.out.println("""b  : scala.math.BigInt = """ + $show(b ));$skip(28); 
	val c = BigDecimal("3.14");System.out.println("""c  : scala.math.BigDecimal = """ + $show(c ));$skip(59); val res$6 = 
	
	//Handling a base and radix
	
	Integer.parseInt("1", 2);System.out.println("""res6: Int = """ + $show(res$6));$skip(27); val res$7 = 
	Integer.parseInt("10", 2);System.out.println("""res7: Int = """ + $show(res$7));$skip(28); val res$8 = 
	Integer.parseInt("100", 2);System.out.println("""res8: Int = """ + $show(res$8));$skip(26); val res$9 = 
	Integer.parseInt("1", 8);System.out.println("""res9: Int = """ + $show(res$9));$skip(27); val res$10 = 
	Integer.parseInt("10", 8);System.out.println("""res10: Int = """ + $show(res$10));$skip(152); 
	
	//Handle Exception:
	//1.
	def toInt(s: String):Option[Int] = {
		
		try{
			Some(s.toInt)
		}catch{
			case e: NumberFormatException => None
		}
	};System.out.println("""toInt: (s: String)Option[Int]""");$skip(37); 
	
	println(toInt("10").getOrElse(0));$skip(34); 
	println(toInt("a").getOrElse(2));$skip(95); 

	//2.
	toInt("string") match{
		case Some(n) =>println(n)
		case None => println("Wrong!")
	};$skip(86); 

	toInt("152") match{
		case Some(n) =>println(n)
		case None => println("Wrong!")
	}}

}
