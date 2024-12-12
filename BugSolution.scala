```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Correct way to ensure changes are reflected 
  val immutableList = list.toList //create a copy

  list += 4 // Modifying the original list after creating the immutable list
  val updatedImmutableList = list.toList // Create a new copy reflecting changes

  println(immutableList) // This will print List(1, 2, 3)
  println(updatedImmutableList) // This will print List(1, 2, 3, 4)
  println(list) // This will print ListBuffer(1, 2, 3, 4)
}
```