package info.gianlucacosta.knapscal.knapsack.branchbound

class RootNode private[branchbound] extends Node(0, 0, Seq()) {
  override def branchString: String = "Root node"

  override def isUpperBoundComputed: Boolean = true
}
