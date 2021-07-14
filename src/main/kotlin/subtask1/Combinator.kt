package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var m = 0
        var n = 0
        if (array.isNotEmpty()) {
            m = array[0]
            n = array[1]
        }
        var xRes: Int? = null
        for (x in 1..m) {
            val comb = combFormula(n, x)
            if (comb >= m) {
                xRes = x
                break
            }
        }
        return xRes
    }

    fun combFormula(n: Int, x: Int): Long {
        try {
            return (factorial(n)) / (factorial(x) * (factorial(n - x)))
        }
        catch ( e: Exception){
            return 0
        }

    }

    fun factorial(num: Int): Long {
        var i = 1
        var factorial: Long = 1
        while (i <= num) {
            factorial *= i
            i++
        }
        return factorial
    }
}
