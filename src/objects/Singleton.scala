/**
 * 6.5. Creating Singletons with object
 */
package objects

object Singleton {

  object CashRegister {
    def open { println("opened") }
    def close { println("closed") }
  }

  CashRegister.open
  CashRegister.close

}