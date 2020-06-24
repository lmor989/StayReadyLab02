package com.codedifferently;

import java.util.Scanner;

public class SciCalculator 
{
    private double currentValue;
    protected CoreFeatures core;
    protected DisplayMode display;
    protected TrigFunctions trig;
    protected Memory mem;
    protected TrigUnits tu;
    Scanner obj = new Scanner(System.in);


    public static void main( String[] args )
    {
     SciCalculator calc = new SciCalculator();
     calc.startCalculator();
    }
    
    // Constructors

    //-----------------------------------------------------
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
    
    //-----------------------------------------------------

    // Calculator logic

    //-----------------------------------------------------

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
        int featureCount = 1;
        System.out.println(featureCount++ + ") Core Features");
        System.out.println(featureCount++ + ") Display Mode");
        System.out.println(featureCount++ + ") Trig Functions");
        System.out.println(featureCount++ + ") Memory");
        System.out.println(featureCount++ + ") Trig Units");
        System.out.println(featureCount++ + ") Exit Calculator");
        
    }

    // Main Menu
    public void mainMenu() {
        showCurrentValue();
        System.out.println("You are at the main menu, please enter a number for the class you would like to access");
        classList();
        String userInput = obj.nextLine();
        int userInputNum = Integer.parseInt(userInput);

        switch (userInputNum) {
            case 1:
                coreFeaturesDisplay();
            case 2:
                displayModeDisplay();
            case 3:
                trigFunctionsDisplay();
            case 4:
                memoryDisplay();
            case 5:
                trigUnitsDisplay();
            case 6:
                clearDisplay();
            case 7:
                exit();
            default:
                System.out.println("You have entered a number not on the list");
                mainMenu();
                
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
        switch (userInputNum) {
            case 1:
                System.out.println("You have selected addition");
                System.out.println("What number would you like to add to the current value?");
                userInput = obj.nextLine();
                userInputNum = Integer.parseInt(userInput);
                setCurrentValue(core.add(getCurrentValue(), userInputNum));
                mainMenu();
                break;
            case 2:
                System.out.println("You have selected subtraction");
                System.out.println("What number would you like to subtract from the current value?");
                userInput = obj.nextLine();
                userInputNum = Integer.parseInt(userInput);
                setCurrentValue(core.subtract(getCurrentValue(), userInputNum));
                mainMenu();
                break;
            case 3:
                System.out.println("You have selected multiply");
                System.out.println("What number would you like to multipy the current value by?");
                userInput = obj.nextLine();
                userInputNum = Integer.parseInt(userInput);
                setCurrentValue(core.multiply(getCurrentValue(), userInputNum));
                mainMenu();
                break;
            case 4:
                System.out.println("You have selected divide");
                System.out.println("What number would you like to divide the current value by?");
                userInput = obj.nextLine();
                userInputNum = Integer.parseInt(userInput);
                setCurrentValue(core.divide(getCurrentValue(), userInputNum));
                mainMenu();
                break;
            case 5:
                System.out.println("You have selected square");
                setCurrentValue(core.square(getCurrentValue()));
                mainMenu();
                break;
            case 6:
                System.out.println("You have selected square root");
                setCurrentValue(core.sqrt(getCurrentValue()));
                mainMenu();
                break;
            case 7:
                System.out.println("You have selected variable exponentiation");
                System.out.println("What number would you like the exponent to be?");
                userInput = obj.nextLine();
                userInputNum = Integer.parseInt(userInput);
                setCurrentValue(core.vEx(getCurrentValue(), userInputNum));
                mainMenu();
                break;
            case 8:
                System.out.println("You have selected inverse");
                setCurrentValue(core.inverse(getCurrentValue()));
                mainMenu();
                break;
            case 9:
                System.out.println("You have selected invert");
                setCurrentValue(core.invert(getCurrentValue()));
                mainMenu();
                break;
            case 10:
                System.out.println("You have selected to exit");
                exit();
                break;
            default:
                System.out.println("You have selected an invalid option");
                mainMenu();
                break;
            
        }
    }

    // List of all display mode functions, takes input and moves on to chosen method
    public void displayModeDisplay() {
        System.out.println("You are currently in the display mode menu, please enter a number for the feature you would like to use");
        displayModeFeaturesList();
        String userInput = obj.nextLine();
        int userInputNum = Integer.parseInt(userInput);
        switch (userInputNum) {
            case 1:
                System.out.println("You have selected switch mode with no input");
                display.switchDisplayMode();
                mainMenu();
                break;

            case 2:
                System.out.println("You have selected switch mode with input");
                System.out.println("What mode would you like to switch to?");
                userInput = obj.nextLine();
                display.switchDisplayMode(userInput);
                mainMenu();
                break;

            case 3:
                System.out.println("You have selected to get the current display mode");
                System.out.println("Current display mode is: " + display.getMode());
                mainMenu();
                break;

            case 4:
                System.out.println("You have selected to exit");
                exit();
                break;

            default:
                System.out.println("You have selected an invalid option");
                mainMenu();
                break;
            
        }
    }

    // List of all trig functions, takes input and moves on to chsoen method
    public void trigFunctionsDisplay() {
        System.out.println("You are currently in the trig functions menu, please enter a number for the feature you would like to use");
        trigFunctionsFeaturesList();
        String userInput = obj.nextLine();
        int userInputNum = Integer.parseInt(userInput);
        switch (userInputNum) {
            case 1:
                System.out.println("You have selected sine");
                setCurrentValue(trig.sine(getCurrentValue()));
                mainMenu();
                break;

            case 2:
                System.out.println("You have selected cosine");
                setCurrentValue(trig.cosine(getCurrentValue()));
                mainMenu();
                break;

            case 3:
                System.out.println("You have selected tangent");
                setCurrentValue(trig.tangent(getCurrentValue()));
                mainMenu();
                break;

            case 4:
                System.out.println("You have selected inverse sine");
                setCurrentValue(trig.invSine(getCurrentValue()));
                mainMenu();
                break;

            case 5:
                System.out.println("You have selected inverse cosine");
                setCurrentValue(trig.invCosine(getCurrentValue()));
                mainMenu();
                break;
            
            case 6:
                System.out.println("You have selected inverse tangent");
                setCurrentValue(trig.invTangent(getCurrentValue()));
                mainMenu();
                break;

            case 7:
                System.out.println("You have selected exit");
                exit();
                break;

            default:
                System.out.println("You have selected an invalid option");
                mainMenu();
                break;
            
        }
    }

    // List of all memory functions, takes input and moves on to chosen method
    public void memoryDisplay() {
        System.out.println("You are currently in the memory menu, please enter a number for the feature you would like to use");
        memoryFeaturesList();
        String userInput = obj.nextLine();
        int userInputNum = Integer.parseInt(userInput);
        switch (userInputNum) {
            case 1:
                System.out.println("You have selected to store the current memory value");
                mem.storeMemValue(currentValue);
                System.out.println("Current memory value: " + mem.recallMem());
                mainMenu();
                break;

            case 2:
                System.out.println("You have selected to add the current value to the current memory value");
                mem.addValueToMemValue(currentValue);
                System.out.println("Current memory value: " + mem.recallMem());
                mainMenu();
                break;

            case 3:
                System.out.println("You have selected to recall current memory value");
                System.out.println("Current memory value: " + mem.recallMem());
                mainMenu();
                break;

            case 4:
                System.out.println("You have selected to reset the current memory value");
                mem.resetMemory();
                System.out.println("Current memory value: " + mem.recallMem());
                mainMenu();
                break;

            case 5:
                System.out.println("You have selected to exit");
                exit();
                break;

            default:
                System.out.println("You have selected an invalid option");
                mainMenu();
                break;
            
        }
    }

    // List of all Trig Unit functions, takes input and moves on to chosen method
    public void trigUnitsDisplay() {
        System.out.println("You are currently in the trig units menu, please enter a number for the feature you would like to use");
        trigUnitsFeaturesList();
        String userInput = obj.nextLine();
        int userInputNum = Integer.parseInt(userInput);
        switch (userInputNum) {
            case 1:
                System.out.println("You have selected switch units with no argument");
                tu.switchUnitsMode();
                mainMenu();
                break;

            case 2:
                System.out.println("You have selected switch units with an argument");
                System.out.println("What mode would you like to switch to?");
                userInput = obj.nextLine();
                tu.switchUnitsMode(userInput);
                mainMenu();
                break;

            case 3:
                System.out.println("You have selected to get the current trig units mode");
                System.out.println("Current mode is : " + tu.getMode());
                mainMenu();
                break;

            case 4:
                System.out.println("You have selected to exit");
                exit();
                break;

            default:
                System.out.println("You have selected an invalid option");
                mainMenu();
                break;
            
        }
    }

    //-----------------------------------------------------

    // Show Features for each class

    //-----------------------------------------------------
    // Displaying CoreFeatures methods
    public void coreFeaturesList() {
        int featureCount = 1;
        System.out.println(featureCount++ + ") Add");
        System.out.println(featureCount++ + ") Subtract");
        System.out.println(featureCount++ + ") Multiply");
        System.out.println(featureCount++ + ") Divide");
        System.out.println(featureCount++ + ") Square");
        System.out.println(featureCount++ + ") Square Root");
        System.out.println(featureCount++ + ") Variable Exponentiation");
        System.out.println(featureCount++ + ") Inverse");
        System.out.println(featureCount++ + ") Invert");
        System.out.println(featureCount++ + ") Exit");
    }

    // Displaying DisplayMode methods
    public void displayModeFeaturesList() {
        int featureCount = 1;
        System.out.println(featureCount++ + ") Switch Dipslay mode without argument");
        System.out.println(featureCount++ + ") Switch Display mode with argument");
        System.out.println(featureCount++ + ") Get current mode");
        System.out.println(featureCount++ + ") Exit");
    }

    // Displaying TrigFunctions methods
    public void trigFunctionsFeaturesList() {
        int featureCount = 1;
        System.out.println(featureCount++ + ") Sine");
        System.out.println(featureCount++ + ") Cosine");
        System.out.println(featureCount++ + ") Tangent");
        System.out.println(featureCount++ + ") Inverse Sine");
        System.out.println(featureCount++ + ") Inverse Cosine");
        System.out.println(featureCount++ + ") Inverse Tangent");
        System.out.println(featureCount++ + ") Exit");
    }

     // Displaying Memory methods
     public void memoryFeaturesList() {
        int featureCount = 1;
        System.out.println(featureCount++ + ") Store Memory Value");
        System.out.println(featureCount++ + ") Add Value to Memory");
        System.out.println(featureCount++ + ") Reset Memory");
        System.out.println(featureCount++ + ") Recall Memory");
        System.out.println(featureCount++ + ") Exit");
    }

    // Displaying TrigUnits methods
    public void trigUnitsFeaturesList() {
        int featureCount = 1;
        System.out.println(featureCount++ + ") Switch Units with no argument");
        System.out.println(featureCount++ + ") Switch Units with a argument");
        System.out.println(featureCount++ + ") Get Mode");
        System.out.println(featureCount++ + ") Exit");
    }
    //----------------------------------------------
    

    // Misc Functions

    //----------------------------------------------

    // Exit Function
    public void exit() {
        System.exit(0);
    }

    // Updates current value to result of operation
    public void setCurrentValue(double num) {
        currentValue = num;
    }

    // Clear display
    public void clearDisplay() {
        currentValue = 0;
    }

    //----------------------------------------------

    // Getters

    //----------------------------------------------

    // Display current value
    public double getCurrentValue() {
        String modeValue;
        if (display.getMode() == "decimal") {
            return currentValue;
        } else if (display.getMode() == "binary") {
            modeValue = Long.toBinaryString(Double.doubleToRawLongBits(currentValue));
            System.out.println("Value in binary: " + modeValue);
            return currentValue;
        } else if (display.getMode() == "octal") {
            modeValue = Long.toOctalString(Double.doubleToRawLongBits(currentValue));
            System.out.println("Value in octal: " + modeValue);
            return currentValue;
        } else if (display.getMode() == "hexadecimal") {
            modeValue = Double.toHexString(currentValue);
            System.out.println("Value in hexadecimal: " + modeValue);
            return currentValue;
        } else {
            return currentValue;
        }
    }

    // Gets the core features
    

    
}
