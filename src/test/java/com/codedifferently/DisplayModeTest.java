package com.codedifferently;

import org.junit.Test;
import org.junit.Assert;

public class DisplayModeTest {
    SciCalculator calc;
    @Test
    public void switchDisplayModeTest() {
        // Given
        calc = new SciCalculator(25);
        
        // When
        calc.display.switchDisplayMode();
        calc.display.switchDisplayMode();
        String expectedValue = "binary";
        String actualValue = calc.display.getMode();

        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void switchDisplayModeInputTest() {
        // Given
        calc = new SciCalculator(25);
        
        // When
        calc.display.switchDisplayMode("binary");
        String expectedValue = "binary";
        String actualValue = calc.display.getMode();

        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void switchDisplayModeInputErrorTest() {
        // Given
        calc = new SciCalculator(25);
        
        // When
        calc.display.switchDisplayMode("blahblah");
        String expectedValue = "decimal";
        String actualValue = calc.display.getMode();

        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getModeTest() {
        // Given
        calc = new SciCalculator(25);
        
        // When
        String expectedValue = "decimal";
        String actualValue = calc.display.getMode();

        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }
    
    
}