/**
 * 4.6 Overriding Default Accessors and Mutators(Getter/Setter)
 * Can't override the getter and setter methods Scala generates for you
 * 1. Create a private var constructor parameter with a name you want to reference from within your class.
 * In the example in the Solution, the field is named _name.
 * 2. Define getter and setter names that you want other classes to use. In the Solution
 * the getter name is  name, and the setter name is  name_=(which, combined with Scala��s
 * syntactic sugar, lets users write p.name = "Jony").
 * 3. Modify the body of the getter and setter methods as desired.
 *
 * It��s important to remember the  private setting on your field.!!
 */
package classes

object OverrideGetterSetter extends App {

  //can't compile
  //  class Person(private var name: String){
  //    def name = name
  //    def name_ = (aName:String){
  //      anem = aName
  //    }
  //  }

  //To solve this problem, change the name of the field you use in the class constructor 
  //so it won��t collide with the name of the getter method you want to use.
  class Person(private var _name: String) {
    def name = _name
    def name_ (aName: String) = {
       _name = aName
    }
   
  }

}