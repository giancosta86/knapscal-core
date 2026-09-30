package info.gianlucacosta.knapscal.knapsack.dynamic.full

import info.gianlucacosta.knapscal.knapsack.{Item, ItemsFormatter}

case class State private[full](items: Seq[Item]) {
  val totalProfit = items.map(_.profit).sum
  val totalWeight = items.map(_.weight).sum

  def dominates(other: State) = (totalWeight <= other.totalWeight && totalProfit >= other.totalProfit) && (this != other)

  def +(item: Item) = new State(items :+ item)

  override def toString: String = s"(${ItemsFormatter.format(items)}, ${totalProfit}, ${totalWeight})"
}
