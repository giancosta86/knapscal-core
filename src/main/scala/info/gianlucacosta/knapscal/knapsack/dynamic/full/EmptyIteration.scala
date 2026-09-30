package info.gianlucacosta.knapscal.knapsack.dynamic.full

private class EmptyIteration extends Iteration {
  override val activeStates: Seq[State] = Seq(new State(Seq()))
  override val dominatedStates: Set[State] = Set()
}
