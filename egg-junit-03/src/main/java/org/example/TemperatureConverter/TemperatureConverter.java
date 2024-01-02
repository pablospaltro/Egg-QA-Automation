package org.example.TemperatureConverter;

public class TemperatureConverter {

    public TemperatureConverter() {
    }

    public double convertCelsiusToFahrenheit(double tempCelsius){
        return (9.0/5.0 * tempCelsius) + 32;
    }

    public double convertFahrenheitToCelsius(double tempFahrenheit){
        return 5.0/9.0 * (tempFahrenheit - 32);
    }
}
