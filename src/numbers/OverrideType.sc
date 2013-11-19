/**
2.3 Overriding the Default Number Type
var [name]:[Type] = [initial value]
**/
package numbers

object OverrideType {
	
	val a = 1                                 //> a  : Int = 1
	
	//one way to override
	val b =1d                                 //> b  : Double = 1.0
	val c = 1f                                //> c  : Float = 1.0
	val d = 100L                              //> d  : Long = 100
	
	//another way
	val e = 0:Byte                            //> e  : Byte = 0
	val f = 0:Int                             //> f  : Int = 0
	val g = 0:Double                          //> g  : Double = 0.0
	
	
	//prefer
	val h:Double = 1                          //> h  : Double = 1.0
	
	
	//ascription
	val s = "Dave"                            //> s  : String = Dave
	val p = s: Object                         //> p  : Object = Dave
	
}