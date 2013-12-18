/**
9.8. Creating Partial Functions
useful in collection
*/
package functional

object PartialFunc {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(302); 
  //throw exception when x=0
  //val divide = (x: Int) => 42 / x
  //divide(0)
  
  val divide = new PartialFunction[Int, Int] {
    def apply(x: Int) = 42 / x
    def isDefinedAt(x: Int) = x != 0
  };System.out.println("""divide  : PartialFunction[Int,Int] = """ + $show(divide ));$skip(75); 

	val divide2: PartialFunction[Int,Int]={
		case d: Int if d!=0 => 42/d
	};System.out.println("""divide2  : PartialFunction[Int,Int] = """ + $show(divide2 ));$skip(25); val res$0 = 

	divide2.isDefinedAt(2);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(35); val res$1 = 

	List(0,1,2).collect{
		divide
	};System.out.println("""res1: List[Int] = """ + $show(res$1))}

}
