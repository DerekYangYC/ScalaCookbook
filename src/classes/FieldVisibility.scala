/**
 * 4.2 Controlling the Visibility of Constructor Fields
 * var,val,private,default
 * 
 */
package classes

object FieldVisibility extends App{
  
  //val by default
  case class Persion(name: String)
  val p = Persion("Da")
  
  //can't compile
//  p.name = "haha"
  
  println(p.name)
}