/**
 * 5.5. Defining a Method That Returns Multiple Items (Tuples)
 */
package methods

object ReturnTuples extends App{

  def getStockInfo = {("NFLX",100.00,101.00)}
  
  val(symbol,currentPrice,bidPrice) = getStockInfo
  
}