package info.gianlucacosta.knapscal.knapsack.dynamic.full

trait Iteration {
  val activeStates: Seq[State]
  val dominatedStates: Set[State]

  override def equals(obj: scala.Any): Boolean = obj match {
    case iteration: Iteration => activeStates == iteration.activeStates && dominatedStates == iteration.dominatedStates
    case _ => false
  }

  override def hashCode(): Int = activeStates.hashCode
}
