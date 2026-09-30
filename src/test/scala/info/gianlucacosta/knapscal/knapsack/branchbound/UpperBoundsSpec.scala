package info.gianlucacosta.knapscal.knapsack.branchbound

import info.gianlucacosta.knapscal.knapsack.{Item, Problem, TestProblems}
import org.scalatest.{FlatSpec, Matchers}

class UpperBoundsSpec extends FlatSpec with Matchers {
  "Optimized Dantzig bound" should "be correct for RootNode III.8" in {
    val problem = TestProblems.problem_III_8
    val rootNode = new RootNode()
    val upperBound = UpperBoundFunctions.optimizedDantzig(problem, rootNode)

    upperBound should be(44)
  }


  "Basic Dantzig bound" should "be correct for RootNode III.9" in {
    val problem = TestProblems.problem_III_9
    val rootNode = new RootNode()
    val upperBound = UpperBoundFunctions.basicDantzig(problem, rootNode)

    upperBound should be(85)
  }


  "Martello-Toth's bound" should "be correctly computed for Problem III.8" in {
    val problem = TestProblems.problem_III_8
    val rootNode = new RootNode()
    val upperBound = UpperBoundFunctions.martelloToth(problem, rootNode)

    upperBound should be(41)
  }


  "Martello-Toth's bound" should "be correctly computed when the critical item is the last item" in {
    val problem = new Problem(
      Seq(
        Item(10, 4),
        Item(3, 15)
      ),

      15
    )
    val rootNode = new RootNode()
    val upperBound = UpperBoundFunctions.martelloToth(problem, rootNode)

    upperBound should be(10)
  }
}
