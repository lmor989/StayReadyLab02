package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest {
    SciCalculator calc;

    @Test
    public void sciCalculatorTest() {
        // Given
        calc = new SciCalculator();

        // When
        double expectedValue = 0;
        double actualValue = calc.getCurrentValue();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void sciCalculatorOverloadTest() {
        // Given
        calc = new SciCalculator(10);

        // When
        double expectedValue = 10;
        double actualValue = calc.getCurrentValue();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void clearDisplayTest() {
        // Given
        calc = new SciCalculator(10);
        
        // When
        calc.clearDisplay();
        double expectedValue = 0;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}