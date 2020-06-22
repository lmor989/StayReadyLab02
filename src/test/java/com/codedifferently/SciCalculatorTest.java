package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SciCalculatorTest {
    SciCalculator calc;

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
    
    @Test
    public void addTest() {
        // Given
        calc = new SciCalculator();
        double num = 5;
        
        // When
        calc.add(num);
        double expectedValue = 5;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
    @Test
    public void substractTest() {
        // Given
        calc = new SciCalculator();
        double num = 5;
        
        // When
        calc.subtract(num);
        double expectedValue = -5;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void multiplyTest() {
        // Given
        calc = new SciCalculator(2);
        double num = 5;
        
        // When
        calc.multiply(num);
        double expectedValue = 10;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void divideTest() {
        // Given
        calc = new SciCalculator(10);
        double num = 2;
        
        // When
        calc.divide(num);
        double expectedValue = 5;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void divideErrorTest() {
        // Given
        calc = new SciCalculator(10);
        double num = 2;
        
        // When
        calc.divide(num);
        double expectedValue = 5;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void squareTest() {
        // Given
        calc = new SciCalculator(3);
        
        // When
        calc.square();
        double expectedValue = 9;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void sqrtTest() {
        // Given
        calc = new SciCalculator(49);
        
        // When
        calc.sqrt();
        double expectedValue = 7;
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
        calc.vEx(num);
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
        calc.inverse();
        double expectedValue = 0.04;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test
    public void invertTest() {
        // Given
        calc = new SciCalculator(20);
        
        // When
        calc.invert();
        double expectedValue = -20;
        double actualValue = calc.getCurrentValue();

        //Then
        Assert.assertEquals(expectedValue, actualValue, 0.001);
    }
}