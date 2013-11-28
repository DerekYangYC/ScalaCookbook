/**
 * 5.4. Using Parameter Names When Calling a Method
 */
package methods

object ParameterNames extends App {

  class Pizza {
    var crustSize = 12
    var crustType = "Thin"
    def update(crustSize: Int, crustType: String) {
      this.crustSize = crustSize
      this.crustType = crustType
    }
    override def toString = {
      "A %d inch %s crust pizza.".format(crustSize, crustType)
    }
  }

  val p = new Pizza
  p.update(crustType = "Pan", crustSize = 14)

}