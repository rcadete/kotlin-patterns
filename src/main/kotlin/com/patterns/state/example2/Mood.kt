package com.patterns.state.example2

import org.slf4j.LoggerFactory


sealed class Mood {
    abstract fun onEnterState()
    abstract fun observe()
}


class Still(var hero: Hero) : Mood(){
    private val logger = LoggerFactory.getLogger(Still::class.java)

    override fun onEnterState() {
        logger.info("${hero} enter state: still")
    }

    override fun observe() {
        logger.info("${hero} is still!")
    }
}

class Aggressive(var hero: Hero): Mood(){
    private val logger = LoggerFactory.getLogger(Aggressive::class.java)

    override fun onEnterState() {
        logger.info("${hero} enter state: aggressive")
    }

    override fun observe() {
        logger.info("${hero} is aggressive!")
    }
}


class Retreating(var hero: Hero) : Mood() {
    private val logger = LoggerFactory.getLogger(Retreating::class.java)

    override fun onEnterState() {
        logger.info("${hero} enter state: retrating")
    }

    override fun observe() {
        logger.info("${hero} is retrating!")
    }
}


class Dead(var hero: Hero): Mood() {
    private val logger = LoggerFactory.getLogger(Dead::class.java)

    override fun onEnterState() {
        logger.info("${hero} enter state: dead")
    }

    override fun observe() {
        logger.info("${hero} is dead!")
    }
}