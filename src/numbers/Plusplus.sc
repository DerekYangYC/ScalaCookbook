/**
2.4 Replacements for ++ and --

**/
package numbers

object Plusplus {
  var a = 2                                       //> a  : Int = 2
  a += 1
  println(a)                                      //> 3
  a -= 1
  println(a)                                      //> 2
  a *= 2
  println(a)                                      //> 4
  a /= 2
  println(a)                                      //> 2
  
  //This symbols(+=/-=) are not operators but methods!!
  //val x =1
  //x +=1
  
}