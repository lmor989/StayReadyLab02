package com.codedifferently;

public class TrigFunctions {
    double degrees;
    double radians;
    double result;

    // Converts the degrees to radians for trig functions, degrees for inv functions
    public void convertToRadians(Double degrees) {
        this.degrees = degrees;
        radians = Math.toRadians(degrees);
    }

    // Gets radians
    public Double getRadians() {
        return this.radians;
    }

    // Sine method
    public Double sine() {
        result = Math.sin(radians);
        return result;
    }

    // Cosine method
    public Double cosine() {
        result = Math.cos(radians);
        return result;
    }

    // Tangent method
    public Double tangent() {
        result = Math.tan(radians);
        return result;
    }

    // Inverse sine method
    public Double invSine() {
        result = Math.asin(degrees);
        return result;
    }

    // Inverse sine method
    public Double invCosine() {
        result = Math.acos(degrees);
        return result;
    }

    // Inverse sine method
    public Double invTangent() {
        result = Math.atan(degrees);
        return result;
    }
}