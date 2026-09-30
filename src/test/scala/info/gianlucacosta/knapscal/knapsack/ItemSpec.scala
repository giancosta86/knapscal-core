package info.gianlucacosta.knapscal.knapsack

import org.scalatest.{FlatSpec, Matchers}


class ItemSpec extends FlatSpec with Matchers {
  "Items" should "be ordered by profit/weight" in {
    val itemA = new Item(4, 2)
    val itemB = new Item(6, 1)

    itemB.compare(itemA) should be(-1)
  }


  "A sequence of items" should "be correctly ordered" in {
    val unsortedList = Seq(
      Item(4, 2),
      Item(12, 12),
      Item(5, 1)
    )

    unsortedList.sorted should be(Seq(
      Item(5, 1),
      Item(4, 2),
      Item(12, 12)
    ))
  }
}
