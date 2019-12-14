package com.patterns.strategy.example1

import org.slf4j.LoggerFactory


class BubbleSort : SortAlgorithm {

    private val logger = LoggerFactory.getLogger(BubbleSort::class.java)

    override fun sort(arr: Array<Int>) {
        logger.info("Sorting array using bubble sort strategy!")
    }
}