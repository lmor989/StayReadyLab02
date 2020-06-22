package com.codedifferently;

import org.junit.Test;
import org.junit.Assert;

public class TrigFunctionsTest {
    SciCalculator calc;
    @Test
    public void convertToRadiansTest() {
        // Given
        calc = new SciCalculator(900);
        
        // When
        calc.getTrigFunctions().convertToRadians(calc.getCurrentValue());
        double expectedValue = 15.708;
        double actualValue = calc.getTrigFunctions().getRadians();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void sineTest() {
        // Given
        calc = new SciCalculator(500);
        
        // When
        calc.getTrigFunctions().convertToRadians(calc.getCurrentValue());
        calc.setCurrentValue(calc.getTrigFunctions().sine());
        double expectedValue = 0.642;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void cosineTest() {
        // Given
        calc = new SciCalculator(45);
        
        // When
        calc.getTrigFunctions().convertToRadians(calc.getCurrentValue());
        calc.setCurrentValue(calc.getTrigFunctions().cosine());
        double expectedValue = 0.707;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void tangentTest() {
        // Given
        calc = new SciCalculator(100);
        
        // When
        calc.getTrigFunctions().convertToRadians(calc.getCurrentValue());
        calc.setCurrentValue(calc.getTrigFunctions().tangent());
        double expectedValue = -5.671;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invSineTest() {
        // Given
        calc = new SciCalculator(0.5);
        
        // When
        calc.getTrigFunctions().convertToRadians(calc.getCurrentValue());
        calc.setCurrentValue(calc.getTrigFunctions().invSine());
        double expectedValue = 0.523;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invCosineTest() {
        // Given
        calc = new SciCalculator(0.8);
        
        // When
        calc.getTrigFunctions().convertToRadians(calc.getCurrentValue());
        calc.setCurrentValue(calc.getTrigFunctions().invCosine());
        double expectedValue = 0.643;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invTangentTest() {
        // Given
        calc = new SciCalculator(1);
        
        // When
        calc.getTrigFunctions().convertToRadians(calc.getCurrentValue());
        calc.setCurrentValue(calc.getTrigFunctions().invTangent());
        double expectedValue = 0.785;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}