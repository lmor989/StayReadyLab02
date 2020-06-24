package com.codedifferently;

public class CoreFeatures {

    // Core Features
    //**********************************************
    // Add method
    public double add(double cv, double num) {
        return cv + num;
    }

    // Subtract method
    public double subtract(double cv, double num) {
        return cv - num;
    }
    
    // Multiply method
    public double multiply(double cv, double num) {
        return cv * num;
    }
    
    // Divide method
    public double divide(double cv, double num) { 
        return cv / num;
    }

    // Square method
    public double square(double cv) {
        return cv * cv;
    }

    // Square root method
    public double sqrt(double cv) {
        return Math.sqrt(cv);
    }

    // Variable Exponentiation method
    public double vEx(double cv, double num) {
        return Math.pow(cv, num);
    }

    // Inverse method
    public double inverse(double cv) {
        return 1 / cv;
    }

    // Invert method
    public double invert(double cv) {
        return cv * -1;
    }
    
}