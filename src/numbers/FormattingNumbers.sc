/**
2.9 Formatting Numbers and Currency
Use java.text.NumberFormat.getIntegerInstance
**/
package numbers

object FormattingNumbers {
	
	val pi = scala.math.Pi                    //> pi  : Double = 3.141592653589793
	
	f"$pi%1.5f"                               //> res0: String = 3.14159
	f"$pi%1.2f"                               //> res1: String = 3.14
	f"$pi%08.2f"                              //> res2: String = 00003.14
}