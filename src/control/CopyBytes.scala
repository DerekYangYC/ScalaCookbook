/**
 * 3.17 Declaring a Variable Before Using It in try/catch/finally Block
 */
package control

import java.io._

object CopyBytes extends App {

  var in = None: Option[FileInputStream] //important! null is not recommended in Scala
  var out = None: Option[FileOutputStream]

  try {
    in = Some(new FileInputStream("/tmp/Test.class"))
    out = Some(new FileOutputStream("/tmp/Test.class.copy"))
    var c = 0
    while ({ c = in.get.read; c != -1 }) {
      out.get.write(c)
    }
  } catch {
    case e: IOException => e.printStackTrace
  } finally {
    println("entered finally ...")
    if (in.isDefined) in.get.close
    if (out.isDefined) out.get.close
  }

}