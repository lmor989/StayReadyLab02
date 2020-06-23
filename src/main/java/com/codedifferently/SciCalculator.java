package com.codedifferently;

import java.util.Scanner;

public class SciCalculator 
{
    private double currentValue;
    private CoreFeatures core;
    private DisplayMode display;
    private TrigFunctions trig;
    private Memory mem;
    private TrigUnits tu;
    Scanner obj = new Scanner(System.in);

    public static void main( String[] args )
    {
     SciCalculator calc = new SciCalculator();
     calc.startCalculator();
    }

    // constructors
    public SciCalculator() {
        this.currentValue = 0;
        core = new CoreFeatures();
        display = new DisplayMode();
        trig = new TrigFunctions();
        mem = new Memory();
        tu = new TrigUnits();
    }

    // overload for starting number at user input
    public SciCalculator(double currentValue) {
        this();
        this.currentValue = currentValue;
    }

    // Display current value
    public Double getCurrentValue() {
        return currentValue;
    }

    // Updates current value to result of operation
    public void setCurrentValue(double num) {
        currentValue = num;
    }

    // Clear display
    public void clearDisplay() {
        currentValue = 0;
    }

    // Calculator logic
    //----------------------------------------------

    // Displayed value
    public void showCurrentValue() {
        spacing();
        System.out.println("Current Value Displayed: " + getCurrentValue());
        spacing();
    }

    // Spacing for display value
    public void spacing() {
        System.out.println("*************************");
    }

    // Choose which class to access
    public void classList() {
        System.out.println("1) Core Features");
        System.out.println("2) Display Mode");
        System.out.println("3) Trig Functions");
        System.out.println("4) Memory");
        System.out.println("5) Trig Units");
        System.out.println("6) Exit Calculator");
        
    }

    // Main Menu
    public void mainMenu() {
        showCurrentValue();
        System.out.println("You are at the main menu, please enter a number for the class you would like to access");
        classList();
        String userInput = obj.nextLine();
        int userInputNum = Integer.parseInt(userInput);
        if (userInputNum == 1) {
            coreFeaturesDisplay();
        }
        
    }

    // Ask starting value, create calculator object
    public void startCalculator() {
        System.out.println("Welcome to Lucious's calculator, what would you like your starting number to be?");
        String userInput = obj.nextLine();
        int userInputNum = Integer.parseInt(userInput);
        setCurrentValue(userInputNum);
        mainMenu(); 
    }

    // List of all core features, takes input and moves on to chosen method
    public void coreFeaturesDisplay() {
        System.out.println("You are currently in the core features menu, please enter a number for the feature you would like to use");
        coreFeaturesList();
        String userInput = obj.nextLine();
        int userInputNum = Integer.parseInt(userInput);
        if (userInputNum == 1) {
            System.out.println("You have selected addition");
            System.out.println("What number would you like to add to the current value?");
             userInput = obj.nextLine();
             userInputNum = Integer.parseInt(userInput);
             this.getCoreFeatures().setResult(this.getCurrentValue());
             this.setCurrentValue(this.getCoreFeatures().add(userInputNum));
             this.showCurrentValue();
        }
    }

    // Choose which features to access
    public void coreFeaturesList() {
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Square");
        System.out.println("6) Square Root");
        System.out.println("7) Variable Exponentiation");
        System.out.println("8) Inverse");
        System.out.println("9) Invert");
        System.out.println("10) Exit");
        
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

    // Gets trig functions
    public TrigFunctions getTrigFunctions() {
        return this.trig;
    }

    // Gets memory functions
    public Memory getMemory() {
        return this.mem;
    }

    // Gets trig units functions
    public TrigUnits getTrigUnits() {
        return this.tu;
    }

    
}
