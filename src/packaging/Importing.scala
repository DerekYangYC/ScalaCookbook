/**
 * 7.2. Importing One or More Members
 */
package packaging

import java.io.{ File, IOException, FileNotFoundException }
import java.io._

object Importing {
  class Foo {
    import javax.swing.JFrame // only visible in this class
    // ...
  }
  class Bar {
    import scala.util.Random // only visible in this class
  }
}