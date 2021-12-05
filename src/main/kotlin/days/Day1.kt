package days

class Day1 : Day(1) {

    override fun partOne(): Any {
        var previousNumber = -1
        var counter = 0
        inputList.forEach{
            val value = Integer.parseInt(it)
            if (previousNumber == -1) {
                //do nothing
            }
            else if (previousNumber < value) {
                counter++
            }
            previousNumber = value
        }
        return counter
    }

    override fun partTwo(): Any {
        val previousNumbers = arrayListOf<Int>()
        var counter = 0
        inputList.forEach{
            val value = Integer.parseInt(it)
            if (previousNumbers.size < 3) {
                previousNumbers.add(value)
            }
            else {
                val previousSum = previousNumbers.sum()
                previousNumbers.removeFirst()
                previousNumbers.add(value)
                val newSum = previousNumbers.sum()
                if (newSum > previousSum) {
                    counter++
                }
            }
        }
        return counter
    }
}
