/**
2.9 Formatting Numbers and Currency
Use java.text.NumberFormat.getIntegerInstance
**/
package numbers

object FormattingNumbers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(159); 
	
	val pi = scala.math.Pi;System.out.println("""pi  : Double = """ + $show(pi ));$skip(15); val res$0 = 
	
	f"$pi%1.5f";System.out.println("""res0: String = """ + $show(res$0));$skip(13); val res$1 = 
	f"$pi%1.2f";System.out.println("""res1: String = """ + $show(res$1));$skip(14); val res$2 = 
	f"$pi%08.2f";System.out.println("""res2: String = """ + $show(res$2))}
}
