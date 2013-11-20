/**
 * 3.11 Using Pattern Matching in Match Expressions
 */
package control

object MatchWithPattern extends App {

  case class Person(firstName: String, lastName: String)
  case class Dog(name: String)

  def echoWhatYouGaveMe(x: Any): String = x match {
    
    // constant patterns
    case 0 => "zero"
    case true => "true"
    case "hello" => "you said 'hello'"
    case Nil => "an empty List"
      
    // sequence patterns
    case List(0, _, _) => "a three-element list with 0 as the first element"
    case List(1, _*) => "a list beginning with 1, having any number of elements"
    case Vector(1, _*) => "a vector starting with 1, having any number of elements"
      
    // tuples
    case (a, b) => s"got $a and $b"
    case (a, b, c) => s"got $a, $b, and $c"
    
    // constructor patterns
    case Person(first, "Alexander") => s"found an Alexander, first name = $first"
    case Dog("Suka") => "found a dog named Suka"
      
    // typed patterns
    case s: String => s"you gave me this string: $s"
    case i: Int => s"thanks for the int: $i"
    case f: Float => s"thanks for the float: $f"
    case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
    case as: Array[String] => s"an array of strings: ${as.mkString(",")}"

    case d: Dog => s"dog: ${d.name}" 
    case list: List[_] => s"thanks for the List: $list" //also case list: List[x] => s"thanks for the List: $list"
    case m: Map[_, _] => m.toString //also case m: Map[a, b] => m.toString
    
    // the default wildcard pattern
    case _ => "Unknown"
  }

}