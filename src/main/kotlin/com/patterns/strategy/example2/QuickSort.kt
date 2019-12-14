package com.patterns.strategy.example2

class QuickSort : SortAlgorithm {

    override fun sort(arr: IntArray): IntArray {
        sortArray(arr, 0, arr.size-1)
        return arr
    }

    private fun sortArray(arr: IntArray, startIndex: Int, endIndex: Int) {
        if (startIndex < endIndex){
            var middleIndex = partition(arr, startIndex, endIndex)
            sortArray(arr, startIndex, middleIndex - 1)
            sortArray(arr, middleIndex + 1, endIndex)
        }
    }

    private fun partition(arr: IntArray, startIndex: Int, endIndex: Int): Int {
        var lastValue = arr[endIndex]
        var i = startIndex - 1
        for (j in startIndex..endIndex-1){
            if (arr[j] <= lastValue){
                i++
                swap(arr, i, j)
            }
        }
        swap(arr, i + 1, endIndex)
        return i + 1
    }

    private fun swap(arr: IntArray, i: Int, j: Int): IntArray {
        val tmp = arr[i]
        arr[i] = arr[j]
        arr[j] = tmp
        return arr
    }
}