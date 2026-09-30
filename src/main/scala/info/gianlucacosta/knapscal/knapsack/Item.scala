package info.gianlucacosta.knapscal.knapsack

import org.apache.commons.math3.fraction.Fraction

case class Item(profit: Int, weight: Int) extends Ordered[Item] {
  require(profit > 0, s"Profit ${profit} must be >= 0")
  require(weight > 0, s"Weight ${weight} must be >= 0")

  val relativeProfit: Fraction = new Fraction(profit, weight)

  override def compare(that: Item): Int = -relativeProfit.compareTo(that.relativeProfit)

  override def toString: String = s"(${profit}, ${weight})"
}
