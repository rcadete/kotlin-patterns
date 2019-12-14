package com.patterns.state.example1

import org.slf4j.LoggerFactory

class CeillingFan(var currentState: FanState = OffState()) {

    private val logger = LoggerFactory.getLogger(CeillingFan::class.java)

    fun pull(){
        currentState.pull(this)
        logger.info("state: ${currentState}")
    }
}