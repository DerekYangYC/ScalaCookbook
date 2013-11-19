/**
3.1 Looping with for and foreach
@How loops are translated!
**/
package control

object ForLoop {
	val a = Array("apple","banana","orange")  //> a  : Array[String] = Array(apple, banana, orange)
	
	for(e<-a){
		//do anything you want with e
		print(e)                          //> applebananaorange
	}
	
	//return value from loop
	val newArray = for(e<-a) yield e.toUpperCase
                                                  //> newArray  : Array[String] = Array(APPLE, BANANA, ORANGE)
	//or
	val newArray2 = for(e<-a) yield{
		//do anything you want
		val s = e.toUpperCase
		s
	}                                         //> newArray2  : Array[String] = Array(APPLE, BANANA, ORANGE)
	
	
	for(e<-0 until a.length){
		print("a")
	}
	
	
	
}