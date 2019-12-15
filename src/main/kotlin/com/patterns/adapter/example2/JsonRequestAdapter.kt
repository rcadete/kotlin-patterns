package com.patterns.adapter.example2

import org.slf4j.LoggerFactory

class JsonRequestAdapter(val webservices: WebServices) : WebRequest {

    private val logger = LoggerFactory.getLogger(JsonRequestAdapter:: class.java)

    override fun request(data: Any): Int {
        val body = convertToJson(data)
        val response = webservices.postRequest(body)
        if (response != null){
            return 200    // success status code
        }
        return 500        // error status code
    }

    fun connect(url: String){
        logger.info("connecting to the endpoint: ${url}")
    }

    private fun convertToJson(data: Any): String{
        logger.info("convert object data into json string")
        return "{temp: 23.5}"
    }
}