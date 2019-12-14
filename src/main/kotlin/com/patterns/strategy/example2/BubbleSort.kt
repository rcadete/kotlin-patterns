package com.patterns.strategy.example2

class BubbleSort : SortAlgorithm {

    override fun sort(arr: IntArray): IntArray {
        var swap = true
        while(swap){
            swap = false
            for (i in 0 until arr.size-1){
                if (arr[i] > arr[i+1]){
                    val temp = arr[i]
                    arr[i] = arr[i+1]
                    arr[i+1] = temp
                    swap = true
                }
            }
        }
        return arr
    }
}

