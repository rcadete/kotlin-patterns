package com.patterns.strategy.example1

import org.slf4j.LoggerFactory


class StrategyContext(var strategy: SortStrategy) {

    private val logger = LoggerFactory.getLogger(StrategyContext::class.java)

    fun arrange(input: Array<Int>) {
        this.strategy.sort(input)
    }

    fun changeStrategy(strategy: SortStrategy) {
        logger.info("Changing strategy ...")
        this.strategy = strategy
    }
}