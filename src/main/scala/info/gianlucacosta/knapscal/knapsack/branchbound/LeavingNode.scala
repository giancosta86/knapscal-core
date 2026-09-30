package info.gianlucacosta.knapscal.knapsack.branchbound

import info.gianlucacosta.knapscal.knapsack.Item

class LeavingNode private[branchbound](nodeIndex: Int, level: Int, takenItems: Seq[Item]) extends Node(nodeIndex, level, takenItems) {
  override def branchString: String = s"X${level} = 0"

  override def isUpperBoundComputed: Boolean = true
}
