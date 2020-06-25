package com.codedifferently;

public class TrigFunctions {
    private TrigUnits tu = new TrigUnits();

    // Sine method
    public double sine(double num) {
        if (tu.getMode() == "degrees"){
            return Math.sin(Math.toRadians(num));
        } else {
            return Math.sin(num);
        }
    }

    // Cosine method
    public double cosine(double num) {
        if (tu.getMode() == "degrees"){
            return Math.cos(Math.toRadians(num));
        } else {
            return Math.cos(num);
        }
    }

    // Tangent method
    public double tangent(double num) {
        if (tu.getMode() == "degrees"){
            return Math.tan(Math.toRadians(num));
        } else {
            return Math.tan(num);
        }
    }

    // Inverse sine method
    public double invSine(double num) {
        if (tu.getMode() == "degrees"){
            return Math.asin(num);
        } else {
            return Math.asin(Math.toRadians(num));
        }
    }

    // Inverse sine method
    public double invCosine(double num) {
        if (tu.getMode() == "degrees"){
            return Math.acos(num);
        } else {
            return Math.asin(Math.toRadians(num));
        }
    }

    // Inverse sine method
    public double invTangent(double num) {
        if (tu.getMode() == "degrees"){
            return Math.atan(num);
        } else {
            return Math.atan(Math.toRadians(num));
        }
    }
}