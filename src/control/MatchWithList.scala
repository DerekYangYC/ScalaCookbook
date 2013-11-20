/**
 * 3.15 Working with a List in a Match Expression
 *
 */
package control

object MatchWithList extends App {

  val x = List(1, 2, 3)
  val y = 1 :: 2 :: 3 :: Nil
  
  //recursive
  def listToString(list: List[String]): String = list match{
    case s :: rest=>s+" "+listToString(rest)
    case Nil => ""
  }
  
  println(listToString("Apples" :: "Bananas" :: "Oranges" :: Nil))

}