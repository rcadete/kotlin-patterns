package com.patterns.strategy.example1

import org.slf4j.LoggerFactory


class QuickSort : SortStrategy {

    private val logger = LoggerFactory.getLogger(QuickSort::class.java)

    override fun sort(numbers: Array<Int>) {
        logger.info("Sorting array using quick sort strategy!")
    }
}