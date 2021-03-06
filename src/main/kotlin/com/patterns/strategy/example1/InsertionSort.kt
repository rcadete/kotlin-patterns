package com.patterns.strategy.example1

import org.slf4j.LoggerFactory


class InsertionSort: SortAlgorithm {

    private val logger = LoggerFactory.getLogger(InsertionSort::class.java)

    override fun sort(arr: Array<Int>) {
        logger.info("Sorting array using insertion sort strategy!")
    }
}