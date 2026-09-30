package info.gianlucacosta.knapscal.knapsack

case class Problem(
                    unsortedItems: Seq[Item],
                    capacity: Int
                    ) {
  require(unsortedItems.nonEmpty, "There must be at least one item")
  require(capacity > 0, s"Capacity ${capacity} must be >= 0")
  unsortedItems.foreach(item => require(capacity >= item.weight, s"Weight ${item.weight} exceeds capacity"))

  val items = unsortedItems.sorted

  def oneBasedItems = items.zipWithIndex.map { case (item, index) => (index + 1, item) }.toMap
}
