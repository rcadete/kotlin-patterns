package com.patterns.adapter.example2

import org.slf4j.LoggerFactory

class WebServices {

    private val logger = LoggerFactory.getLogger(WebServices::class.java)

    fun postRequest(body: String): String? {
        logger.info("running postRequest()")
        return "OK"
    }

    fun getRequest(): String? {
        logger.info("running getRequest()")
        return "OK"
    }
}