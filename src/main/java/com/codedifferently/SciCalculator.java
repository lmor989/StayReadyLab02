package com.codedifferently;

public class SciCalculator 
{
    private double currentValue;
    private CoreFeatures core;
    private DisplayMode display;

    public static void main( String[] args )
    {
        SciCalculator calc = new SciCalculator();
        calc.core.add(5);
    }

    // constructors
    public SciCalculator() {
        this.currentValue = 0;
        core = new CoreFeatures();
        display = new DisplayMode();
    }

    // overload for starting at user input
    public SciCalculator(double currentValue) {
        this.currentValue = currentValue;
        core = new CoreFeatures();
        display = new DisplayMode();
    }

    // Display current value
    public Double getCurrentValue() {
        return currentValue;
    }

    // Updates current value to result of operation
    public void setCurrentValue(double num) {
        currentValue = num;
    }

    // Clear Display
    public void clearDisplay() {
        currentValue = 0;
    }

    // Getters for other classes
    //----------------------------------------------
    // Gets the core features
    public CoreFeatures getCoreFeatures() {
        return this.core;
    }

    // Gets dislay mode features
    public DisplayMode getDisplayMode() {
        return this.display;
    }

    
}
