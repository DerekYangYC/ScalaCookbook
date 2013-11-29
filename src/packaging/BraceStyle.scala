/**
 * 7.1. Packaging with the Curly Braces Style Notation
 */
package packaging

// a package containing a class named Foo
package orderentry {
  class Foo { override def toString = "I am orderentry.Foo" }
}
// one package nested inside the other
package customers {
  class Foo { override def toString = "I am customers.Foo" }
  package database {
    // this Foo is different than customers.Foo or orderentry.Foo
    class Foo { override def toString = "I am customers.database.Foo" }
  }
}

object BraceStyle extends App {
  println(new orderentry.Foo)
  println(new customers.Foo)
  println(new customers.database.Foo)

}