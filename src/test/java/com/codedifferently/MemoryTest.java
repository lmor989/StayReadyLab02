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
        calc.mem.storeMemValue(calc.getCurrentValue());
        double expectedValue = 50;
        double actualValue = calc.mem.recallMem();

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void addValueToMemValueTest() {
        // Given
        calc = new SciCalculator(50);

        // When
        calc.mem.storeMemValue(calc.getCurrentValue());
        calc.mem.addValueToMemValue(calc.getCurrentValue());
        double expectedValue = 100;
        double actualValue = calc.mem.recallMem();;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void resetMemoryTest() {
        // Given
        calc = new SciCalculator(50);

        // When
        calc.mem.storeMemValue(calc.getCurrentValue());
        calc.mem.resetMemory();
        double expectedValue = 0;
        double actualValue = calc.mem.recallMem();;

        // Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}