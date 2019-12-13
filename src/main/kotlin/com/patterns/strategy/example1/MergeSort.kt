package com.patterns.strategy.example1

import org.slf4j.LoggerFactory


class MergeSort : SortStrategy {

    private val logger = LoggerFactory.getLogger(MergeSort::class.java)

    override fun sort(numbers: Array<Int>) {
        logger.info("Sorting array using merge sort strategy!")
    }
}