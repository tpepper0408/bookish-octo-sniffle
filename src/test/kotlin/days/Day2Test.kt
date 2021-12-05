package days

import org.junit.Test

import org.junit.Assert.*

class Day2Test {

    private val day2 = Day2()

    @Test
    fun partOne() {
        assertEquals(150, day2.partOne())
    }

    @Test
    fun partTwo() {
        assertEquals(900, day2.partTwo())
    }
}