/**
3.3 Using a For Loop with Embedded If statements (Guards)
**/

package control

object Guards {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 
	
	for(i <- 1 to 10 if i%2==0) println(i);$skip(72); 
  for{
  	i <- 1 to 10
  	if i>3
  	if i<6
  	if i%2 ==0
  } println(i)}
	
}
