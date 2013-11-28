/**
 * 5.7. Creating Methods That Take Variable-Argument Fields
 * Define a varargs field in your method declaration by adding a  *  character after the field type
 * a method can have only one varargs field
 */
package methods

object VariableArgument extends App {

  def printAll(strings: String*) {
    strings.foreach(println)
  }

  printAll()
  printAll("foo")
  printAll("foo", "bar")
  printAll("foo", "bar", "baz")

  //_*  operator to adapt a sequence (Array, List, Seq, Vector, etc.)
  
  val fruits = List("apple","banana","cherry")
  
  printAll(fruits: _*)
  
  //treating the ¡§no args¡¨ situation as a Nil$  keeps your code from throwing a NullPointerException
  printAll()
  
}