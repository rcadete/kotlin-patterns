package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class TemperatureSensor {

    private val logger = LoggerFactory.getLogger(TemperatureSensor::class.java)

    fun getTemperature(){
        logger.info("Getting temperature from the sensor...")
    }
}