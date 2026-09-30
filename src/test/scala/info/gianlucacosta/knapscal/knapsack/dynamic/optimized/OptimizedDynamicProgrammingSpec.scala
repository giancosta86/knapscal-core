package info.gianlucacosta.knapscal.knapsack.dynamic.optimized

import info.gianlucacosta.knapscal.knapsack.TestProblems
import org.scalatest.{FlatSpec, Matchers}

class OptimizedDynamicProgrammingSpec extends FlatSpec with Matchers {
  "Problem III.8" should "be solved" in {
    val problem = TestProblems.problem_III_8

    val solver = new OptimizedDynamicProgrammingSolver()
    val solution = solver.solve(problem)

    solution.value should be(40)
  }


  "Problem III.9" should "be solved" in {
    val problem = TestProblems.problem_III_9

    val solver = new OptimizedDynamicProgrammingSolver()
    val solution = solver.solve(problem)

    solution.value should be(79)
  }
}
