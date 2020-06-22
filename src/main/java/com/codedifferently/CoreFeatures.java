package com.codedifferently;

public class CoreFeatures {
    double result;

    // Core Features
    //**********************************************
    public void setResult(Double result) {
        this.result = result;
    }

    // Add method
    public Double add(double num) {
        result += num;
        return result;
    }

    // Subtract method
    public Double subtract(double num) {
        result -= num;
        return result;
    }
    
    // Multiply method
    public Double multiply(double num) {
        result *= num;
        return result;
    }
    
    // Divide method
    public Double divide(double num) { 
        result /= num;
        return result;
    }

    // Square method
    public Double square() {
        result *= result;
        return result;
    }

    // Square root method
    public Double sqrt() {
        result = Math.sqrt(result);
        return result;
    }

    // Variable Exponentiation method
    public Double vEx(Double num) {
        result = Math.pow(result, num);
        return result;
    }

    // Inverse method
    public Double inverse() {
        result = 1/result;
        return result;
    }

    // Invert method
    public Double invert() {
        result *= -1;
        return result;
    }
    
}