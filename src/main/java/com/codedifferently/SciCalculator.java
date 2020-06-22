package com.codedifferently;

public class SciCalculator 
{
    private double currentValue;

    public static void main( String[] args )
    {
        SciCalculator calc = new SciCalculator(10);
        System.out.println(calc.divide(0));
        
    }

    // constructors

    public SciCalculator() {
        currentValue = 0;
    }

    public SciCalculator(double currentValue) {
        this.currentValue = currentValue;
    }

    // Core Features
    //**********************************************
    // Display current value
    public Double getCurrentValue() {
        return currentValue;
    }

    // Clear Display
    public void clearDisplay() {
        currentValue = 0;
    }

    // Add method
    public Double add(double num) {
        currentValue += num;
        return currentValue;
    }

    // Substract method
    public Double subtract(double num) {
        currentValue -= num;
        return currentValue;
    }
    
    // Multiply method
    public Double multiply(double num) {
        currentValue *= num;
        return currentValue;
    }
    
    // Divide method
    public Double divide(double num) { 
        currentValue /= num;
        return currentValue;
    }

    // Square method
    public Double square() {
        currentValue *= currentValue;
        return currentValue;
    }

    // Square root method
    public Double sqrt() {
        currentValue = Math.sqrt(currentValue);
        return currentValue;
    }

    // Variable Exponentiation method
    public Double vEx(Double num) {
        currentValue = Math.pow(currentValue, num);
        return currentValue;
    }

    // Inverse method
    public Double inverse() {
        currentValue = 1/currentValue;
        return currentValue;
    }

    // Invert method
    public Double invert() {
        currentValue *= -1;
        return currentValue;
    }
}
