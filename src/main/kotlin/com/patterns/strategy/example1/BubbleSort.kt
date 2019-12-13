package com.patterns.strategy.example1

import org.slf4j.LoggerFactory


class BubbleSort : SortStrategy {

    private val logger = LoggerFactory.getLogger(BubbleSort::class.java)

    override fun sort(numbers: Array<Int>) {
        logger.info("Sorting array using bubble sort strategy!")
    }
}