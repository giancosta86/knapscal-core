package info.gianlucacosta.knapscal.knapsack

object ItemsParser {
  private val itemRegex = """\s*(\d+)\s*\|\s*(\d+)\s*""".r
}


class ItemsParser {
  private var latestInputText = ""
  private var latestResult: Seq[Item] = List()

  def parse(inputText: String): Seq[Item] = {
    if (inputText == latestInputText) {
      return latestResult
    }

    latestResult = inputText
      .split("\n")
      .map(line => line.trim)
      .filter(line => !line.isEmpty)
      .map(line => {
      val matchResult = ItemsParser.itemRegex.findFirstMatchIn(line)

      if (matchResult.isEmpty) {
        throw new IllegalArgumentException(s"Invalid item format: '${line}'")
      }

      val matcher = matchResult.get
      Item(
        matcher.group(1).toInt,
        matcher.group(2).toInt
      )
    })

    latestInputText = inputText


    return latestResult
  }
}
