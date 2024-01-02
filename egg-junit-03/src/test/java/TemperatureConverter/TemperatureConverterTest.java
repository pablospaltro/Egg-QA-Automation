package TemperatureConverter;

import org.example.TemperatureConverter.TemperatureConverter;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TemperatureConverterTest {

    private static TemperatureConverter temperatureConverter;

    @BeforeClass
    public static void setUp(){
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void testCelsiusToFahrenheitConversion(){
        assertEquals(68, temperatureConverter.convertCelsiusToFahrenheit(20),0);
        assertEquals(32, temperatureConverter.convertCelsiusToFahrenheit(0),0);
        assertEquals(212, temperatureConverter.convertCelsiusToFahrenheit(100),0);
    }

    @Test
    public void testFahrenheitToCelsiusConversion(){
        assertEquals(20, temperatureConverter.convertFahrenheitToCelsius(68), 0);
        assertEquals(0, temperatureConverter.convertFahrenheitToCelsius(32), 0);
        assertEquals(100, temperatureConverter.convertFahrenheitToCelsius(212), 0);
    }
}
