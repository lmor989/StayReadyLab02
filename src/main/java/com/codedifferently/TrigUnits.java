package com.codedifferently;

public class TrigUnits {
    private String mode = "degrees";

    // Switches mode between degrees and radians
    public void switchUnitsMode() {
        if (mode == "degrees") {
            mode = "radians";
        } else {
            mode = "degrees";
        }
    }

    // Switches mode based on the user input
    public void switchUnitsMode(String s) {
        switch(s) {
            case "degrees":
                mode = "degrees";
                break;
            case "radians":
                mode = "radians";
                break;
            default:
                System.out.println("Invalid mode");
                System.out.println("Mode Not changed");
        }
    }

    // Gets mode
    public String getMode() {
        return mode;
    }
}