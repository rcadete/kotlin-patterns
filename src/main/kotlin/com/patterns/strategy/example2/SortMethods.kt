package com.patterns.strategy.example2

import org.slf4j.LoggerFactory

object SortMethods {

    private val logger = LoggerFactory.getLogger(SortMethods::class.java)

    val bubbleSort = fun (arr: IntArray): IntArray{
        logger.info("Sorting array using bubble sort strategy!")
        return BubbleSort().sort(arr)
    }

    val insertionSort = fun (arr: IntArray): IntArray {
        logger.info("Sorting array using insertion sort strategy!")
        return InsertionSort().sort(arr)
    }

    val mergeSort = fun (arr: IntArray): IntArray{
        logger.info("Sorting array using merge sort strategy!")
        return MergeSort().sort(arr)
    }

    val quickSort = fun (arr: IntArray): IntArray{
        logger.info("Sorting array using quick sort strategy!")
        return QuickSort().sort(arr)
    }
}