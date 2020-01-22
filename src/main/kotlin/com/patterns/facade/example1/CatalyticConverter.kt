package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class CatalyticConverter {

    private val logger = LoggerFactory.getLogger(CatalyticConverter::class.java)

    fun on(){
        logger.info("Catalytic converter switched on!")
    }

    fun off(){
        logger.info("Catalytic converter switched off!")
    }
}