/**
 * 8.5. Limiting Which Classes Can Use a Trait by Inheritance
 *  TraitName can only be mixed into classes that extend a type named SuperThing,
 *  where  SuperThingmay be a trait, class, or abstract class:
 *  trait TraitName extends SuperThing
 *  
 *  It seems rare that a trait and a class the trait will be mixed into should both have the same superclass
 */
package traits

object LimitTraitInheritance {

  class StarfleetComponent
  trait StarfleetWarpCore extends StarfleetComponent
  class Starship extends StarfleetComponent with StarfleetWarpCore

  class RomulanStuff
  // won't compile
  //class Warbird extends RomulanStuff with StarfleetWarpCore

  abstract class Employee
  class CorporateEmployee extends Employee
  class StoreEmployee extends Employee

  trait DeliversFood extends StoreEmployee
  // this is allowed
  class DeliveryPerson extends StoreEmployee with DeliversFood
  // won't compile
  //class Receptionist extends CorporateEmployee with DeliversFood
}