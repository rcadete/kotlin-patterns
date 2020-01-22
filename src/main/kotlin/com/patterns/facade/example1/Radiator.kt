package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class Radiator {

    private val logger = LoggerFactory.getLogger(Radiator::class.java)

    fun on(){
        logger.info("Radiator switched on!")
    }

    fun off(){
        logger.info("Radiator.switched off!")
    }

    fun setSpeed(speed: Int){
        logger.info("Setting radiator speed to {}", speed)
    }
}