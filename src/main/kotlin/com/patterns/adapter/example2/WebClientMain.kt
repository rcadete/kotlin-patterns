package com.patterns.adapter.example2

fun main() {

    val webServices = WebServices()

    val jsonRequestAdapter = JsonRequestAdapter(webServices)
    jsonRequestAdapter.connect("http://demo.com")

    val webClient = WebClient(jsonRequestAdapter)
    webClient.upload("something to upload")
}