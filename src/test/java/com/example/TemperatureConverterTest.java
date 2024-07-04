package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(37.777777778, TemperatureConverter.fahrenheitToCelsius(100), 0.0001);
        assertEquals(-17.777777778, TemperatureConverter.fahrenheitToCelsius(0), 0.0001);
        assertEquals(10, TemperatureConverter.fahrenheitToCelsius(50), 0.0001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.0001);
        assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.0001);
        assertEquals(50, TemperatureConverter.celsiusToFahrenheit(10), 0.0001);
    }
}

