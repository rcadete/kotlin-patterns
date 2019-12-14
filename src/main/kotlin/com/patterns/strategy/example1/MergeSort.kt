package com.patterns.strategy.example1

import org.slf4j.LoggerFactory


class MergeSort : SortAlgorithm {

    private val logger = LoggerFactory.getLogger(MergeSort::class.java)

    override fun sort(arr: Array<Int>) {
        logger.info("Sorting array using merge sort strategy!")
    }
}