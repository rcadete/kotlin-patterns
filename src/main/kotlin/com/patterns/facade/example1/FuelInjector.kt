package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class FuelInjector(private val fuelPump: FuelPump) {

    private val logger = LoggerFactory.getLogger(FuelInjector::class.java)

    fun on(){
        logger.info("Fuel injector ready to inject fuel")
    }

    fun injected(){
        logger.info("Fuel injected!")
    }

    fun off(){
        logger.info("Stopping fuel injector...")
    }
}