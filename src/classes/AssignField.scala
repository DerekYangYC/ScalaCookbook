/**
 * 4.8. Assigning a Field to a Block or Function
 */
package classes

object AssignField extends App {

  class Foo {
    val text =
      io.Source.fromFile("/etc/passwd").getLines.foreach(println)
  }

  //text  field isn��t initialized until it��s accessed. That��s how a lazy field works
  //Defining a field as lazyis a useful approach when the field might not be accessed in the normal processing of your algorithms
  class Boo {
    lazy val text =
      io.Source.fromFile("/etc/passwd").getLines.foreach(println)
  }

}