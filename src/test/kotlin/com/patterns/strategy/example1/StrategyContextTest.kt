package com.patterns.strategy.example1

import org.junit.Test
import org.mockito.Mockito.*

class StrategyContextTest {

    @Test
    fun testSort() {
        // given
        val input = arrayOf(1,2,3,4,5)

        // when
        val strategy = mock(BubbleSort::class.java)
        val context = StrategyContext(strategy)
        context.sort(input)

        // then
        verify(strategy).sort(input)
        verifyNoMoreInteractions(strategy)
    }


    @Test
    fun testChangeStrategy(){
        // given
        val input = arrayOf(1,2,3,4,5)

        // when use initial strategy
        val initialStrategy = mock(BubbleSort::class.java)
        val context = StrategyContext(initialStrategy)
        context.sort(input)

        // then
        verify(initialStrategy).sort(input)

        // when change strategy
        val newStrategy = mock(QuickSort::class.java)
        context.changeStrategy(newStrategy)

        // then
        context.sort(input)
        verify(newStrategy).sort(input)

        verifyNoMoreInteractions(initialStrategy, newStrategy)
    }
}