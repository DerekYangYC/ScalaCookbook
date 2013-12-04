/**
 * 6.2. The Scala Equivalent of Java's .class
 * Use the Scala classOf  method instead of Java's .class
 * 
 * //scala
 * val info = new DataLine.Info(classOf[TargetDataLine], null)
 * 
 * // java
 * info = new DataLine.Info(TargetDataLine.class, null);
 */

package objects

object EquivalentOfClass {
	val stringClass = classOf[String]
}