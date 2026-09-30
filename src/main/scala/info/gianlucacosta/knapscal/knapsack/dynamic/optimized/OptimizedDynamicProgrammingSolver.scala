package info.gianlucacosta.knapscal.knapsack.dynamic.optimized

import info.gianlucacosta.knapscal.knapsack.{Item, Problem}

class OptimizedDynamicProgrammingSolver() {
  def solve(problem: Problem): Solution = {
    Solution(
      optimalSolution(problem.items)(problem.capacity)
    )
  }


  def optimalSolution(items: Seq[Item])(availableCapacity: Int): Int = {
    require(availableCapacity >= 0)

    if (items.isEmpty) {
      return 0
    }


    val currentItem = items.head

    return if (availableCapacity < currentItem.weight)
      optimalSolution(items.tail)(availableCapacity)
    else math.max(
      optimalSolution(items.tail)(availableCapacity),
      currentItem.profit + optimalSolution(items.tail)(availableCapacity - currentItem.weight)
    )
  }
}
