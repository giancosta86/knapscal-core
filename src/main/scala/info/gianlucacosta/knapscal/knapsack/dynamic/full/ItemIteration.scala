package info.gianlucacosta.knapscal.knapsack.dynamic.full

import info.gianlucacosta.knapscal.knapsack.Item

import scala.collection.mutable


private class ItemIteration(previousIteration: Iteration, item: Item, capacity: Int) extends Iteration {
  override val (activeStates, dominatedStates) = {
    var activeStates = previousIteration.activeStates ++
      previousIteration.activeStates
        .map(state => state + item)
        .filter(state => state.totalWeight <= capacity)


    val dominatedStates = mutable.Set[State]()

    activeStates.foreach(possiblyDominating => {
      activeStates.foreach(possiblyDominated => {
        if (possiblyDominating.dominates(possiblyDominated)) {
          if (!dominatedStates.contains(possiblyDominating) && !dominatedStates.contains(possiblyDominated)) {
            dominatedStates.add(possiblyDominated)
          }
        }
      })
    })

    activeStates = activeStates.filter(state => !dominatedStates.contains(state))

    (activeStates, dominatedStates.toSet)
  }
}
