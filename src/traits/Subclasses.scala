/**
 * 8.6. Marking Traits So They Can Only Be Used by Subclasses of a Certain Type
 * To make sure a trait named MyTrait can only be mixed into a class that is a subclass of a type named  BaseType:
 * trait MyTrait {
 *   this: BaseType =>
 */
package traits

object Subclasses {

  trait StarfleetWarpCore {
    this: Starship =>
  }

  class Starship
  class Enterprise extends Starship with StarfleetWarpCore

  class RomulanShip
  // this won't compile
  //class Warbird extends RomulanShip with StarfleetWarpCore

  /*
   *  The following WarpCore definition requires that any type that wishes to mix it in 
   *  must extend  WarpCoreEjectorand  FireExtinguisher, in addition to extending Starship
   */
  trait WarpCore {
    this: Starship2 with WarpCoreEjector with FireExtinguisher =>
  }

  class Starship2
  trait WarpCoreEjector
  trait FireExtinguisher
  // this works
  class Enterprise2 extends Starship2
    with WarpCore
    with WarpCoreEjector
    with FireExtinguisher

  /*
   *  However, if the  Enterprise doesn’t extend  Starship,  WarpCoreEjector, and FireExtinguisher, 
   *  the code won’t compile.
   */
  //class Enterprise extends Starship2 with WarpCore with WarpCoreEjector
}