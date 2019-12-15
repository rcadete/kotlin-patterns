package com.patterns.adapter.example1



fun main(){
    val initialTemperature = 32.0
    val temperatureMeter = TemperatureMeter(initialTemperature)

    val converter = TemperatureConverter(temperatureMeter)

    println("Temperature in Celsius: ${converter.celsiusTemperature}")
    println("Temperature in Fahrenheit: ${converter.fahrenheitTemperature}")

    converter.celsiusTemperature = 35.0

    println("Temperature in Celsius: ${converter.celsiusTemperature}")
    println("Temperature in Fahrenheit: ${converter.fahrenheitTemperature}")

    converter.fahrenheitTemperature = 55.0

    println("Temperature in Celsius: ${converter.celsiusTemperature}")
    println("Temperature in Fahrenheit: ${converter.fahrenheitTemperature}")
}

