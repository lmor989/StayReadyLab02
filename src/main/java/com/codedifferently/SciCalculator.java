package com.codedifferently;

public class SciCalculator 
{
    private double currentValue;
    private CoreFeatures core;
    private DisplayMode display;
    private TrigFunctions trig;

    public static void main( String[] args )
    {
        
    }

    // constructors
    public SciCalculator() {
        this.currentValue = 0;
        core = new CoreFeatures();
        display = new DisplayMode();
        trig = new TrigFunctions();
    }

    // overload for starting number at user input
    public SciCalculator(double currentValue) {
        this.currentValue = currentValue;
        core = new CoreFeatures();
        display = new DisplayMode();
        trig = new TrigFunctions();
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

    public TrigFunctions getTrigFunctions() {
        return this.trig;
    }

    
}
