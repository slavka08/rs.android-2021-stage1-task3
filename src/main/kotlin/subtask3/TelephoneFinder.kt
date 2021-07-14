package subtask3

import java.lang.Exception

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val resultList: MutableList<String>? = mutableListOf()
        try {
            for (s in 0..number.length-1) {
                val sInt:Int = Integer.parseInt(number[s].toString())
                val findNear = findNear(sInt)
                if (findNear?.isNotEmpty() == true) {
                    for (num in findNear){
                        val tmpNum = StringBuilder(number).also { it.setCharAt(s, num) }
                        resultList?.add( tmpNum.toString())
                        println(tmpNum.toString())
                    }
                }
            }
            var resultArray: Array<String>? = resultList?.toTypedArray()

            return resultArray
        }
        catch (e : Exception){
            return null
        }

    }

    private fun findNear(num: Int): List<Char>? {
        return when (num) {
            1 -> listOf('2', '4')
            2 -> listOf('1', '3', '5')
            3 -> listOf('2', '6')
            4 -> listOf('1', '5', '7')
            5 -> listOf('2', '8', '4', '6')
            6 -> listOf('9', '5', '3')
            7 -> listOf('8', '4')
            8 -> listOf('5', '9', '7','0')
            9 -> listOf('8', '6')
            0 -> listOf('8')
            else -> null
        }

    }
}
