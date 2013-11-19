/**
3.2 Using for Loops with Multiple Counters
**/
package control

object Counters {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(185); 
	
	for{
		i <- 1 to 3 //generator!
		j <- 1 to 2
		k <- 1 to 4
	}println(s"i = $i, j = $j, k = $k")}
	
	
}
