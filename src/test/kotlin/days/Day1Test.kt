package days

import junit.framework.Assert.assertEquals
import org.junit.Test

class Day1Test {

    private val dayOne = Day1()

    @Test
    fun testPartOne() {
        assertEquals(7, dayOne.partOne())
    }

    @Test
    fun testPartTwo() {
        assertEquals(5, dayOne.partTwo())
    }
}
