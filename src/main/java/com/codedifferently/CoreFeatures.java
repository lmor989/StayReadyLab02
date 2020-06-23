package com.codedifferently;

public class CoreFeatures {
    double result;

    // Core Features
    //**********************************************
    public void setResult(double result) {
        this.result = result;
    }

    // Add method
    public double add(double num) {
        result += num;
        return result;
    }

    // Subtract method
    public double subtract(double num) {
        result -= num;
        return result;
    }
    
    // Multiply method
    public double multiply(double num) {
        result *= num;
        return result;
    }
    
    // Divide method
    public double divide(double num) { 
        result /= num;
        return result;
    }

    // Square method
    public double square() {
        result *= result;
        return result;
    }

    // Square root method
    public double sqrt() {
        result = Math.sqrt(result);
        return result;
    }

    // Variable Exponentiation method
    public double vEx(Double num) {
        result = Math.pow(result, num);
        return result;
    }

    // Inverse method
    public double inverse() {
        result = 1/result;
        return result;
    }

    // Invert method
    public double invert() {
        result *= -1;
        return result;
    }
    
}