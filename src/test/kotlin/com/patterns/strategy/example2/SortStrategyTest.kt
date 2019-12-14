package com.patterns.strategy.example2

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SortStrategyTest {


    @Test
    fun testSort() {
        // given
        val input = arrayOf(5, 2, 4, 1, 3, 9, 7, 6, 8).toIntArray()
        val expected = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        // when
        val actual = SortStrategy().sort(input)

        // then
        assertArrayEquals(expected, actual)
    }


    @Test
    fun testChangeStrategy(){
        // given
        val input = arrayOf(5, 2, 4, 1, 3, 9, 7, 6, 8).toIntArray()
        val expected = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        // when use initial strategy
        val sortStrategy = SortStrategy()
        var actual = sortStrategy.sort(input)

        // then
        assertArrayEquals(expected, actual)

        // when change strategy
        sortStrategy.currentMethod = SortMethods.quickSort
        actual = sortStrategy.sort(input)

        // then
        assertArrayEquals(expected, actual)
    }
}