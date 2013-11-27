/**
 * 4.16. Creating Inner Classes
 */
package classes

object InnerClasses extends App {

  class PandorasBox {
    case class Thing(name: String)

    var things = new collection.mutable.ArrayBuffer[Thing]()

    things += Thing("Evil Thing #1")
    things += Thing("Evil Thing #2")
    def addThing(name: String) { things += new Thing(name) }
  }

  val p = new PandorasBox
  p.things.foreach(println)

  // inner classes are bound to the object
  val oc1 = new OuterClass
  val oc2 = new OuterClass
  val ic1 = new oc1.InnerClass
  val ic2 = new oc2.InnerClass
  ic1.x = 10
  ic2.x = 20
  println(s"ic1.x = ${ic1.x}")
  println(s"ic2.x = ${ic2.x}")
}

class OuterClass {
  class InnerClass {
    var x = 1
  }

}