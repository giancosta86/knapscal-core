package info.gianlucacosta.knapscal.knapsack.dynamic.full

import info.gianlucacosta.knapscal.knapsack.{Item, Problem}

import scala.collection.mutable.ListBuffer

class DynamicProgrammingSolver {
  def solve(problem: Problem): Solution = {
    val iterations = ListBuffer[Iteration](new EmptyIteration())

    problem.items.foreach(item => {
      iterations += new ItemIteration(iterations.last, item, problem.capacity)
    })


    var bestProfit = 0
    var bestItems: Seq[Item] = Seq()

    iterations.last.activeStates.foreach(state => {
      if (state.totalProfit > bestProfit) {
        bestProfit = state.totalProfit
        bestItems = state.items
      }
    })


    return new Solution(iterations, bestItems, bestProfit)
  }
}
