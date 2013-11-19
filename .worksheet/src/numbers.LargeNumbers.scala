/**
2.6 Handling Very Large Numbers
User Scala BigInt and BigDecimal
Unlike their Java equivalents, these two support all the operators of numeric types
**/
package numbers

object LargeNumbers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(225); 
	
	var b = BigInt(1234567890);System.out.println("""b  : scala.math.BigInt = """ + $show(b ));$skip(44); 
	
	var c = BigDecimal(12345678900000.12345);System.out.println("""c  : scala.math.BigDecimal = """ + $show(c ));$skip(7); val res$0 = 
	
	b*b;System.out.println("""res0: scala.math.BigInt = """ + $show(res$0));$skip(6); 
	b+=1;$skip(12); 
	println(b);$skip(8); 
	c += 1;$skip(12); 
	println(c)}
	
}
