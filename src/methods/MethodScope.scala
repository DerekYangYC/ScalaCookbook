/**
 * 5.1. Controlling Method Scope
 * Scala methods are public by default
 */
package methods

object MethodScope extends App {

  //Object-private scope
  class OPS {

    private[this] def isFoo = true

    //    def doFoo(other:OPS) = other.isFoo //Can't compile
  }

  //private scope
  class PS {

    private def isFoo = true

    def doFoo(other: PS) = other.isFoo

  }

  //protected scope: makes the method available to subclasses
  class ProtectedScope {

    class Animal {
      protected def breathe {}
    }

    class Dog extends Animal {
      breathe
    }

  }

  //package scope
  class PackageScope {

    class Foo {
      private[methods] def doX {}
      private def doY {}
    }
    class Bar {
      val f = new Foo
      f.doX // compiles
      //      f.doY // won't compile
    }

  }
  
  
  
}