package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {
    SciCalculator calc;
    @Test
    public void addTest() {
        // Given
        calc = new SciCalculator(5);
        double num = 5;
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().add(num));
        double expectedValue = 10;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void subtractTest() {
        // Given
        calc = new SciCalculator(10);
        double num = 3;
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().subtract(num));
        double expectedValue = 7;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void multiplyTest() {
        // Given
        calc = new SciCalculator(5);
        double num = 5;
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().multiply(num));
        double expectedValue = 25;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void divideTest() {
        // Given
        calc = new SciCalculator(12);
        double num = 3;
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().divide(num));
        double expectedValue = 4;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void squareTest() {
        // Given
        calc = new SciCalculator(3);
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().square());
        double expectedValue = 9;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void sqrtTest() {
        // Given
        calc = new SciCalculator(81);
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().sqrt());
        double expectedValue = 9;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void vExTest() {
        // Given
        calc = new SciCalculator(3);
        double num = 3;
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().vEx(num));
        double expectedValue = 27;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void inverseTest() {
        // Given
        calc = new SciCalculator(25);
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().inverse());
        double expectedValue = 0.04;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invertTest() {
        // Given
        calc = new SciCalculator(100);
        
        // When
        calc.getCoreFeatures().setResult(calc.getCurrentValue());
        calc.setCurrentValue(calc.getCoreFeatures().invert());
        double expectedValue = -100;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
    
}