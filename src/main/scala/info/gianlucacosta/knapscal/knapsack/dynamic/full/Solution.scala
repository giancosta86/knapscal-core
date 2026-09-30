package info.gianlucacosta.knapscal.knapsack.dynamic.full

import info.gianlucacosta.knapscal.knapsack.Item

case class Solution private[full](iterations: Seq[Iteration], items: Seq[Item], value: Int) {
  override def toString(): String = {
    val result = new StringBuilder()

    result.append("Items: ")
    result.append(items)
    result.append("\n\n")

    result.append("Value: ")
    result.append(value)
    result.append("\n\n\n")

    result.append("==== ITERATIONS ===\n")
    result.append("\n\n")


    iterations.zipWithIndex.foreach {
      case (iteration, index) => {
        result.append(s"* Iteration ${index} *\n\n")
        result.append(s"M${index} = {\n\t${iteration.activeStates.mkString(",\n\t")}\n}\n\n")

        result.append(s"Dominated states = ")

        if (iteration.dominatedStates.isEmpty) {
          result.append("{}")
        } else {
          result.append(s"{\n\t${iteration.dominatedStates.mkString(",\n\t")}\n}")
        }
        result.append("\n\n")


        result.append("\n\n")
      }
    }

    return result.toString()
  }
}
