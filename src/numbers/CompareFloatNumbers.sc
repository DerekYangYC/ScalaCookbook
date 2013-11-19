/**
2.5 Comparing Floating-Point Numbers
Like Java, needs approximately equal
**/
package numbers

object CompareFloatNumbers {
	
	def ~=(x: Double, y: Double, precision: Double) = {
		if((x-y).abs < precision) true else false
	}                                         //> ~= : (x: Double, y: Double, precision: Double)Boolean
	
	val a = 0.3                               //> a  : Double = 0.3
	
	val b = 0.1+0.2                           //> b  : Double = 0.30000000000000004
	
	
	println(~=(a,b,0.001))                    //> true
}