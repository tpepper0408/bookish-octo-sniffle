package days

import java.lang.RuntimeException

class Day2: Day(2) {
    override fun partOne(): Any {
        var depth = 0
        var horizontal = 0
        inputList.forEach{
            if (it.startsWith("forward")) {
                val increment = Integer.parseInt(it.substring(8).trim())
                horizontal += increment
            }
            else if (it.startsWith("down")) {
                val increment = Integer.parseInt(it.substring(5).trim())
                depth += increment
            } else if (it.startsWith("up")) {
                val increment = Integer.parseInt(it.substring(3).trim())
                depth -= increment
            } else {
                throw RuntimeException("Unexpected input")
            }
        }
        return depth * horizontal
    }

    override fun partTwo(): Any {
        var depth = 0
        var horizontal = 0
        var aim = 0
        inputList.forEach{
            if (it.startsWith("forward")) {
                val increment = Integer.parseInt(it.substring(8).trim())
                horizontal += increment
                depth += (aim * increment)
            }
            else if (it.startsWith("down")) {
                val increment = Integer.parseInt(it.substring(5).trim())
                aim += increment
            } else if (it.startsWith("up")) {
                val increment = Integer.parseInt(it.substring(3).trim())
                aim -= increment
            } else {
                throw RuntimeException("Unexpected input")
            }
        }
        return depth * horizontal
    }
}