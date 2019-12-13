package com.patterns.strategy.example1

import org.junit.Test
import org.mockito.Mockito.*

class StrategyContextTest {

    @Test
    fun testArrange() {
        // given
        val input = arrayOf(1,2,3,4,5)

        // when
        val strategy = mock(BubbleSort::class.java)
        val context = StrategyContext(strategy)
        context.arrange(input)

        // then
        verify(strategy).sort(input)
        verifyNoMoreInteractions(strategy)
    }


    @Test
    fun testChangeStrategy(){
        // given
        val input = arrayOf(1,2,3,4,5)

        // when
        val initialStrategy = mock(BubbleSort::class.java)
        val context = StrategyContext(initialStrategy)
        context.arrange(input)

        // then
        verify(initialStrategy).sort(input)

        // when
        val newStrategy = mock(QuickSort::class.java)
        context.changeStrategy(newStrategy)

        // then
        context.arrange(input)
        verify(newStrategy).sort(input)

        verifyNoMoreInteractions(initialStrategy, newStrategy)
    }
}