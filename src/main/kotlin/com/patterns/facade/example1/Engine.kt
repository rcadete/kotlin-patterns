package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class Engine {

    private val logger = LoggerFactory.getLogger(Engine::class.java)

    fun start(){
        logger.info("Starting engine...")
    }
}