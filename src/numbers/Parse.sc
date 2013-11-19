/**
2.1 Parsing a Number From a String
Char
Byte
Short
Int
Long
Float
Double
**/

package numbers

object Parse {
  "100".toInt                                     //> res0: Int = 100
  "100".toDouble                                  //> res1: Double = 100.0
  "100".toFloat                                   //> res2: Float = 100.0
  "1".toLong                                      //> res3: Long = 1
  "1".toShort                                     //> res4: Short = 1
  "1".toByte                                      //> res5: Byte = 1
  
  //"foo".toInt
  val b = BigInt("1")                             //> b  : scala.math.BigInt = 1
	val c = BigDecimal("3.14")                //> c  : scala.math.BigDecimal = 3.14
	
	//Handling a base and radix
	
	Integer.parseInt("1", 2)                  //> res6: Int = 1
	Integer.parseInt("10", 2)                 //> res7: Int = 2
	Integer.parseInt("100", 2)                //> res8: Int = 4
	Integer.parseInt("1", 8)                  //> res9: Int = 1
	Integer.parseInt("10", 8)                 //> res10: Int = 8
	
	//Handle Exception:
	//1.
	def toInt(s: String):Option[Int] = {
		
		try{
			Some(s.toInt)
		}catch{
			case e: NumberFormatException => None
		}
	}                                         //> toInt: (s: String)Option[Int]
	
	println(toInt("10").getOrElse(0))         //> 10
	println(toInt("a").getOrElse(2))          //> 2

	//2.
	toInt("string") match{
		case Some(n) =>println(n)
		case None => println("Wrong!")
	}                                         //> Wrong!

	toInt("152") match{
		case Some(n) =>println(n)
		case None => println("Wrong!")
	}                                         //> 152

}