package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class FuelPump {

    private val logger = LoggerFactory.getLogger(FuelPump::class.java)

    fun pump(){
        logger.info("Fuel pump is pumping fuel...")
    }
}