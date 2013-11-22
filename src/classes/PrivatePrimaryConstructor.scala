/**
 * 4.4 Defining a Private Primary Constructor
 * Use for Singleton pattern or Utility class
 * Use Object instead of class with private constructor
 */
package classes

object PrivatePrimaryConstructor extends App{

  //Singleton
  class Brain private (name: String){
    override def toString = s"This is brain and $name"
  }
  
  //companion object
  object Brain{
    val brain = new Brain("Ha")
    def getInstance = brain
  }
  
  val brain = Brain.getInstance
  println(brain)
  
  //Utility classes with Object
  object FileUtils{
    
    def read(fileName:String)={
      //
    }
    
  }
  
  val contents = FileUtils.read("input.txt")
  
}