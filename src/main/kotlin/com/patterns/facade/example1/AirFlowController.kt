package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class AirFlowController(private val airFlowMeter: AirFlowMeter) {

    private val logger = LoggerFactory.getLogger(AirFlowController::class.java)


    fun takeAir(){
        airFlowMeter.getMeasurements()
        logger.info("Air provided!")
    }

    fun off(){
        logger.info("Air controller switched off")
    }
}