package com.patterns.strategy.example1

import org.slf4j.LoggerFactory


class StrategyContext(var algorithm: SortAlgorithm) {

    private val logger = LoggerFactory.getLogger(StrategyContext::class.java)

    fun sort(input: Array<Int>) {
        this.algorithm.sort(input)
    }

    fun changeStrategy(algorithm: SortAlgorithm) {
        logger.info("Changing strategy ...")
        this.algorithm = algorithm
    }
}