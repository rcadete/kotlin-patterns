package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class AirFlowMeter {

    private val logger = LoggerFactory.getLogger(AirFlowMeter::class.java)

    fun getMeasurements() {
        logger.info("Getting air measurements")
    }
}