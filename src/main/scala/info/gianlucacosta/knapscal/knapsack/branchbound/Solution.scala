package info.gianlucacosta.knapscal.knapsack.branchbound

import info.gianlucacosta.knapscal.knapsack.ItemsFormatter


case class Solution private[branchbound](rootNode: RootNode, bestNode: Node, nodes: List[Node]) {
  require(bestNode.isSolution)
  require(bestNode.upperBound == 0)
  require(!nodes.isEmpty)

  override def toString(): String = s"""Solution value: ${bestNode.totalProfit}
      |
      |Solution items: ${ItemsFormatter.format(bestNode.takenItems)}
      |
      |Best node: ${bestNode.index}""".stripMargin
}
