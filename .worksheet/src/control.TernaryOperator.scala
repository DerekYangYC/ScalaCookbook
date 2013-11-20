/**
3.6 Using the if Construct Like a Ternary Operator-?: in Java
**/
package control

object TernaryOperator {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(124); 
	
	val a = 5;System.out.println("""a  : Int = """ + $show(a ));$skip(30); 
	
	println(if(a<0) -a else a)}
	
}
