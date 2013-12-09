/**
 * 9.2. Using Functions as Variables
 */
package functional

object AsVariables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(125); 

  val double = (i: Int) => { i * 2 };System.out.println("""double  : Int => Int = """ + $show(double ));$skip(30); 
  val list = List.range(1, 5);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(21); val res$0 = 

  list.map(double);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(43); val res$1 = 

  //or using anonymous
  list.map(_ * 2);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(81); 

  //variable:
  // implicit approach
  val add = (x: Int, y: Int) => { x + y };System.out.println("""add  : (Int, Int) => Int = """ + $show(add ));$skip(39); 
  val add2 = (x: Int, y: Int) => x + y;System.out.println("""add2  : (Int, Int) => Int = """ + $show(add2 ));$skip(75); 
  // explicit approach
  val add3: (Int, Int) => Int = (x, y) => { x + y };System.out.println("""add3  : (Int, Int) => Int = """ + $show(add3 ));$skip(48); 
  val add4: (Int, Int) => Int = (x, y) => x + y;System.out.println("""add4  : (Int, Int) => Int = """ + $show(add4 ));$skip(51); 

  //method:
  def modMethod(i: Int) = i % 2 == 0;System.out.println("""modMethod: (i: Int)Boolean""");$skip(42); 
  def modMethod2(i: Int) = { i % 2 == 0 };System.out.println("""modMethod2: (i: Int)Boolean""");$skip(47); 
  def modMethod3(i: Int): Boolean = i % 2 == 0;System.out.println("""modMethod3: (i: Int)Boolean""");$skip(51); 
  def modMethod4(i: Int): Boolean = { i % 2 == 0 };System.out.println("""modMethod4: (i: Int)Boolean""")}
}
