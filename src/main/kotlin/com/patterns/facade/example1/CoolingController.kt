package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class CoolingController(private val radiator: Radiator, private val temperatureSensor: TemperatureSensor) {

    private val logger = LoggerFactory.getLogger(CoolingController::class.java)

    companion object{
        const val DEFAULT_RADIATOR_SPEED = 10
    }

    private var temperatureUpperLimit: Int? = null

    fun setTemperatureUpperLimit(temperatureUpperLimit: Int){
        logger.info("Setting temperature upper limit to {}", temperatureUpperLimit)
        this.temperatureUpperLimit = temperatureUpperLimit
    }

    fun on() {
        logger.info("Cooling Controller started...")
    }

    fun run() {
        logger.info("Cooling Controller ready!")
        radiator.setSpeed(DEFAULT_RADIATOR_SPEED)
    }

    fun cool(maxAllowedTemp: Int?) {
        logger.info("Scheduled cooling with maximum allowed temperature {}", maxAllowedTemp)
        temperatureSensor.getTemperature()
        radiator.on()
    }

    fun off() {
        logger.info("Stopping cooling controller...")
        radiator.off()
    }

}