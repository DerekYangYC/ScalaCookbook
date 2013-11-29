/**
 * 7.3. Renaming Members on Import
 */
package packaging

import java.util.{ ArrayList => JavaList }
import java.util.{ Date => JDate, HashMap => JHashMap }

object RenameImport {
  // error: this won't compile because HashMap was renamed
  // during the import process
  //  val map = new HashMap[String, String]

  val map = new JHashMap[String, String]
}