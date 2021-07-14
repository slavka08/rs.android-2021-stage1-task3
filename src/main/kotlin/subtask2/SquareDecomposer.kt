package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        var tmpSquareVal = number * number

        val resultList = mutableListOf<Int>()
        var nextelem = number - 1

        while (nextelem > 0) {
            resultList.add(nextelem)

            tmpSquareVal -= nextelem * nextelem

            if (tmpSquareVal == 0)
                return resultList.reversed().toTypedArray()

            if (nextelem == 1) {
                if (resultList.size < 2) {
                    break
                }
                tmpSquareVal += resultList.last() * resultList.last()
                resultList.removeAt(resultList.lastIndex)
                nextelem = resultList.last() - 1
                tmpSquareVal += resultList.last() * resultList.last()
                resultList.removeAt(resultList.lastIndex)
            } else {
                var sqVal: Int = kotlin.math.sqrt(tmpSquareVal.toDouble()).toInt()
                if (nextelem <= sqVal) {
                    nextelem--
                } else {
                    nextelem = sqVal
                }
            }
        }


        return null
    }
}
