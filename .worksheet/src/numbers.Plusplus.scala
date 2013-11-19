/**
2.4 Replacements for ++ and --

**/
package numbers

object Plusplus {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  var a = 2;System.out.println("""a  : Int = """ + $show(a ));$skip(9); 
  a += 1;$skip(13); 
  println(a);$skip(9); 
  a -= 1;$skip(13); 
  println(a);$skip(9); 
  a *= 2;$skip(13); 
  println(a);$skip(9); 
  a /= 2;$skip(13); 
  println(a)}
  
  //This symbols(+=/-=) are not operators but methods!!
  //val x =1
  //x +=1
  
}
