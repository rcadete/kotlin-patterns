package com.patterns.strategy.example1


fun main(){
    val input = arrayOf(1,2,3,4,5)

    val context = StrategyContext(BubbleSort())
    context.sort(input)

    context.changeStrategy(InsertionSort())
    context.sort(input)

    context.changeStrategy(MergeSort())
    context.sort(input)

    context.changeStrategy(QuickSort())
    context.sort(input)
}