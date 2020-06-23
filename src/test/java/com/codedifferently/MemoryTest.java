package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {
    SciCalculator calc;

    @Test
    public void storeMemValueTest() {
        // Given
        calc = new SciCalculator(50);

        // When
        calc.getMemory().storeMemValue(calc.getCurrentValue());
        double expectedValue = 50;
        double actualValue = calc.getMemory().recallMem();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void addValueToMemValueTest() {
        // Given
        calc = new SciCalculator(50);

        // When
        calc.getMemory().storeMemValue(calc.getCurrentValue());
        calc.getMemory().addValueToMemValue(calc.getCurrentValue());
        double expectedValue = 100;
        double actualValue = calc.getMemory().recallMem();;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void resetMemoryTest() {
        // Given
        calc = new SciCalculator(50);

        // When
        calc.getMemory().storeMemValue(calc.getCurrentValue());
        calc.getMemory().resetMemory();
        double expectedValue = 0;
        double actualValue = calc.getMemory().recallMem();;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}