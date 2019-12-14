package com.patterns.strategy.example2

fun main(){
    val input = arrayOf(5,2,4,1,3,9,7,6,8).toIntArray()

    println("input: ${input.joinToString(prefix = "[", postfix = "]")}")

    val sortStrategy = SortStrategy()
    var output = sortStrategy.sort(input)

    println("BubbleSort: ${output.joinToString(prefix = "[", postfix = "]")}")


    sortStrategy.currentMethod = SortMethods.insertionSort
    output = sortStrategy.sort(input)

    println("InsertSort: ${output.joinToString(prefix = "[", postfix = "]")}")


    sortStrategy.currentMethod = SortMethods.mergeSort
    output = sortStrategy.sort(input)

    println("MergeSort: ${output.joinToString(prefix = "[", postfix = "]")}")



    sortStrategy.currentMethod = SortMethods.quickSort
    output = sortStrategy.sort(input)

    println("Quicksort: ${output.joinToString(prefix = "[", postfix = "]")}")
}