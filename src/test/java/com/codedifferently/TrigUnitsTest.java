package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    SciCalculator calc;

    @Test
    public void switchUnitsModeTest() {
        // Given
        calc = new SciCalculator(30);

        // When
        calc.tu.switchUnitsMode();
        String expectedValue = "radians";
        String actualValue = calc.tu.getMode();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void switchUnitsModeInputTest() {
        // Given
        calc = new SciCalculator(30);

        // When
        calc.tu.switchUnitsMode("degrees");
        String expectedValue = "degrees";
        String actualValue = calc.tu.getMode();

        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}