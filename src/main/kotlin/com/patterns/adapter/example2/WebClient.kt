package com.patterns.adapter.example2

import org.slf4j.LoggerFactory

class WebClient(val request: WebRequest) {

    private val logger = LoggerFactory.getLogger(WebClient::class.java)

    fun upload(content : String){
        val responseCode = request.request(content)
        if (responseCode == 200){
            logger.info("Status: OK")
        } else {
            logger.info("Status:: ERROR")
        }
    }
}