package info.gianlucacosta.knapscal.knapsack.branchbound

import scala.collection.mutable.ListBuffer

private class NodeBuffer {
  private val buffer = ListBuffer[Node]()

  def +=(node: Node): Unit = {
    require(node.index == buffer.size, s"Node index ${node.index} != ${buffer.size}")

    buffer += node
  }

  def clear() = buffer.clear

  def size() = buffer.size

  def toList = buffer.toList
}
