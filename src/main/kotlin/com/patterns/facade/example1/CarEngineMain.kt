package com.patterns.facade.example1

fun main(){

    val carEngineFacade = CarEngineFacade()

    carEngineFacade.startEngine()
    println("...")
    carEngineFacade.stopEngine()
}