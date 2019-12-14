package com.patterns.strategy.example2

class InsertionSort : SortAlgorithm {

    override fun sort(arr: IntArray): IntArray {
        for (j in 1 until arr.size-1){
            var i = j - 1
            val value = arr[j]
            while((i >= 0) && (arr[j] > value)){
                arr[i + 1] = arr[i]
                i--
            }
            arr[i + 1] = value
        }
        return arr
    }
}