package com.patterns.adapter.example1

class TemperatureConverter(private var temperatureMeter: TemperatureMeter, var decimals: Int = 2) : TemperatureInfo {

    override var fahrenheitTemperature : Double
        get() = convertToFahrenheit(temperatureMeter.temperature).round(decimals)
        set(temp) {
            temperatureMeter.temperature = convertToCelsius(temp).round(decimals)
        }

    override var celsiusTemperature: Double
        get() = temperatureMeter.temperature.round(decimals)
        set(temp) {
            temperatureMeter.temperature = temp.round(decimals)
        }

    private fun convertToCelsius(fahrenheitTemperature: Double) : Double = (fahrenheitTemperature - 32) * 5 / 9.0

    private fun convertToFahrenheit(celsiusTemperature: Double) : Double = (celsiusTemperature * 9 / 5) + 32.0

    private fun Double.round(decimals: Int): Double = "%.${decimals}f".format(this).toDouble()
}