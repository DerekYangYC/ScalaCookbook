/**
 * 6.9. Implement the Factory Method in Scala with apply
 *
 */
package objects

object FactoryMethodWithApply extends App {

  trait Animal {
    def speak
  }

  object Animal {
    private class Dog extends Animal {
      override def speak { println("woof") }
    }
    private class Cat extends Animal {
      override def speak { println("meow") }
    }
    // the factory method
    def apply(s: String): Animal = {
      if (s == "dog") new Dog
      else new Cat
    }

    // an alternative factory method (use one or the other)
    def getAnimal(s: String): Animal = {
      if (s == "dog") return new Dog
      else return new Cat
    }
  }

  val cat = Animal("cat") // returns a Cat
  val dog = Animal("dog") // returns a Dog

  cat.speak
  dog.speak

}