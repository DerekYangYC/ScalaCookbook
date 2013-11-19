/**
2.2 Converting Between Numeric Type(Casting)

**/
package numbers

object Casting {
	
	19.45.toInt                               //> res0: Int = 19
	19.toFloat                                //> res1: Float = 19.0
	19.toDouble                               //> res2: Double = 19.0
	19.toLong                                 //> res3: Long = 19
	
	val b = 1945.toFloat                      //> b  : Float = 1945.0
	
	//isValidmethods to test whether the type can be converted before attempting the conversion
	
	val a = 1000L                             //> a  : Long = 1000
	a.isValidByte                             //> res4: Boolean = false
	a.isValidShort                            //> res5: Boolean = true
	
}