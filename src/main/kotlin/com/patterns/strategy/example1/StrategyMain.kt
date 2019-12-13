package com.patterns.strategy.example1


fun main(){
    val input = arrayOf(1,2,3,4,5)

    val context = StrategyContext(BubbleSort())
    context.arrange(input)

    context.changeStrategy(QuickSort())
    context.arrange(input)
}