/**
2.6 Handling Very Large Numbers
User Scala BigInt and BigDecimal
Unlike their Java equivalents, these two support all the operators of numeric types
**/
package numbers

object LargeNumbers {
	
	var b = BigInt(1234567890)                //> b  : scala.math.BigInt = 1234567890
	
	var c = BigDecimal(12345678900000.12345)  //> c  : scala.math.BigDecimal = 12345678900000.123
	
	b*b                                       //> res0: scala.math.BigInt = 1524157875019052100
	b+=1
	println(b)                                //> 1234567891
	c += 1
	println(c)                                //> 12345678900001.123
	
}