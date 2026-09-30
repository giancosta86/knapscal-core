package info.gianlucacosta.knapscal.knapsack

object ItemsFormatter {
  def format(items: Seq[Item]) = s"[${items.mkString(", ")}]"
}
