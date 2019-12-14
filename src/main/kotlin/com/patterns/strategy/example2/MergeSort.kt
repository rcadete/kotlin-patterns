package com.patterns.strategy.example2

class MergeSort : SortAlgorithm {

    override fun sort(arr: IntArray): IntArray {
        sortArray(arr, 0, arr.size - 1 )
        return arr
    }

    private fun sortArray(arr: IntArray, startIndex: Int, endIndex: Int) {
        var size = endIndex - startIndex + 1
        if (size == 1){
            return
        }
        var middleIndex = Math.floor((startIndex + endIndex) / 2.0).toInt()
        sortArray(arr, startIndex, middleIndex)
        sortArray(arr, middleIndex + 1, endIndex)
        merge(arr, startIndex, middleIndex, endIndex)
    }

    private fun merge(arr: IntArray, startIndex: Int, middleIndex: Int, endIndex: Int){
        var left = arr.copyOfRange(startIndex, middleIndex + 1)
        var right = arr.copyOfRange(middleIndex + 1, endIndex + 1)
        var i = 0
        var j = 0
        for (k in startIndex..endIndex){
            if ( (i <= left.size - 1) && ((j >= right.size) || (left[i] <= right[j]) )){
                arr[k] = left[i]
                i++
            } else {
                arr[k] = right[j]
                j++
            }
        }
    }
}