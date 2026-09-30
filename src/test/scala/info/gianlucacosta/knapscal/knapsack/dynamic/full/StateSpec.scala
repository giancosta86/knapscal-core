package info.gianlucacosta.knapscal.knapsack.dynamic.full

import info.gianlucacosta.knapscal.knapsack.Item
import org.scalatest.{FlatSpec, Matchers}

class StateSpec extends FlatSpec with Matchers {
  "A state" should "not dominate itself" in {
    val state = State(Seq(Item(20, 30), Item(5, 8)))

    state.dominates(state) should be(false)
  }
}
