package com.codedifferently;

import org.junit.Test;
import org.junit.Assert;

public class TrigFunctionsTest {
    SciCalculator calc;

    @Test
    public void sinefromDegreesTest() {
        // Given
        calc = new SciCalculator(500);
        
        // When
        calc.setCurrentValue(calc.trig.sine(calc.getCurrentValue()));
        double expectedValue = 0.642;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void sineFromRadiansTest() {
        // Given
        calc = new SciCalculator(500);
        
        // When
        calc.tu.switchUnitsMode();
        calc.setCurrentValue(calc.trig.sine(calc.getCurrentValue()));
        double expectedValue = 0.642;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void cosineFromDegreesTest() {
        // Given
        calc = new SciCalculator(45);
        
        // When
        calc.setCurrentValue(calc.trig.cosine(calc.getCurrentValue()));
        double expectedValue = 0.707;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void cosineFromRadiansTest() {
        // Given
        calc = new SciCalculator(45);
        
        // When
        calc.tu.switchUnitsMode();
        calc.setCurrentValue(calc.trig.cosine(calc.getCurrentValue()));
        double expectedValue = 0.707;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void tangentFromDegreesTest() {
        // Given
        calc = new SciCalculator(100);
        
        // When
        calc.setCurrentValue(calc.trig.tangent(calc.getCurrentValue()));
        double expectedValue = -5.671;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void tangentFromRadiansTest() {
        // Given
        calc = new SciCalculator(100);
        
        // When
        calc.tu.switchUnitsMode();
        calc.setCurrentValue(calc.trig.tangent(calc.getCurrentValue()));
        double expectedValue = -5.671;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invSineFromDegreesTest() {
        // Given
        calc = new SciCalculator(0.5);
        
        // When
        calc.setCurrentValue(calc.trig.invSine(calc.getCurrentValue()));
        double expectedValue = 0.523;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invSineFromRadiansTest() {
        // Given
        calc = new SciCalculator(0.5);
        
        // When
        calc.tu.switchUnitsMode();
        calc.setCurrentValue(calc.trig.invSine(calc.getCurrentValue()));
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
        calc.setCurrentValue(calc.trig.invCosine(calc.getCurrentValue()));
        double expectedValue = 0.643;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invCosineFromRadiansTest() {
        // Given
        calc = new SciCalculator(0.8);
        
        // When
        calc.tu.switchUnitsMode();
        calc.setCurrentValue(calc.trig.invCosine(calc.getCurrentValue()));
        double expectedValue = 0.643;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invTangentFromDegreesTest() {
        // Given
        calc = new SciCalculator(1);
        
        // When
        calc.setCurrentValue(calc.trig.invTangent(calc.getCurrentValue()));
        double expectedValue = 0.785;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invTangentFromRadiansTest() {
        // Given
        calc = new SciCalculator(1);
        
        // When
        calc.tu.switchUnitsMode();
        calc.setCurrentValue(calc.trig.invTangent(calc.getCurrentValue()));
        double expectedValue = 0.785;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}