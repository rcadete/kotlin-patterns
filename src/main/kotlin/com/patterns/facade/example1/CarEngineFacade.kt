package com.patterns.facade.example1

import org.slf4j.LoggerFactory

class CarEngineFacade {

    private val logger = LoggerFactory.getLogger(CarEngineFacade::class.java)

    companion object{
        const val DEFAULT_COOLING_TEMP = 90
        const val MAX_ALLOWED_TEMP = 40
    }

    val fuelPump = FuelPump()
    val fuelInjector = FuelInjector(fuelPump)
    val airFlowController = AirFlowController(AirFlowMeter())
    val coolingController = CoolingController(Radiator(), TemperatureSensor())
    val catalyticConverter = CatalyticConverter()
    val engine = Engine()


    fun startEngine(){
        fuelInjector.on()
        airFlowController.takeAir()
        fuelInjector.on()
        fuelInjector.injected()
        engine.start()
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP)
        coolingController.run()
        coolingController.on()
        catalyticConverter.on()
    }

    fun stopEngine(){
        catalyticConverter.off()
        coolingController.cool(MAX_ALLOWED_TEMP)
        coolingController.off()
        airFlowController.off()
        fuelInjector.off()
    }

}