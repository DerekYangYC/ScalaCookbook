/**
3.1 Looping with for and foreach
@How loops are translated!
**/
package control

object ForLoop {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(143); 
	val a = Array("apple","banana","orange");System.out.println("""a  : Array[String] = """ + $show(a ));$skip(57); 
	
	for(e<-a){
		//do anything you want with e
		print(e)
	};$skip(77); 
	
	//return value from loop
	val newArray = for(e<-a) yield e.toUpperCase;System.out.println("""newArray  : Array[String] = """ + $show(newArray ));$skip(96); 
	//or
	val newArray2 = for(e<-a) yield{
		//do anything you want
		val s = e.toUpperCase
		s
	};System.out.println("""newArray2  : Array[String] = """ + $show(newArray2 ));$skip(44); 
	
	
	for(e<-0 until a.length){
		print("a")}
	}
	
	
	
}
