package info.gianlucacosta.knapscal.knapsack

import org.scalatest.{FlatSpec, Matchers}

class ProblemSpec extends FlatSpec with Matchers {
  "The items" should "be ordered in Problem III.8" in {
    val problem = TestProblems.problem_III_8

    problem.items should be(Seq(
      Item(3, 1),
      Item(23, 8),
      Item(11, 4),
      Item(28, 12),
      Item(6, 4),
      Item(2, 2)
    ))
  }


  "The items" should "be ordered in Problem III.9" in {
    val problem = TestProblems.problem_III_9

    problem.items should be(Seq(
      Item(40, 5),
      Item(52, 17),
      Item(9, 3),
      Item(38, 13),
      Item(1, 1)
    ))
  }
}
