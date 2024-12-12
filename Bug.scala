```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Incorrect way to convert to an immutable list
  val immutableList = list.toList

  list += 4 // Modifying the original list after creating the immutable list

  println(immutableList) // This will still print List(1, 2, 3)
  println(list) // This will print ListBuffer(1, 2, 3, 4)
}
```