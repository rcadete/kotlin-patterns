package com.patterns.strategy.example2

class SortStrategy {

    var currentMethod = SortMethods.bubbleSort

    val sort = fun(arr: IntArray): IntArray{
        return currentMethod(arr)
    }
}