package com.codedifferently;

public class DisplayMode {
    private String[] listOfDisplays = {"binary", "octal", "decimal", "hexadecimal"}; 
    private int modeIndex = 2;
    private String whichMode = listOfDisplays[modeIndex];

    public void switchDisplayMode() {
        if (modeIndex == 3) {
            modeIndex = 0;
            whichMode = listOfDisplays[modeIndex];
        } else {
            modeIndex++;
            whichMode = listOfDisplays[modeIndex];
        }

    }

    public String switchDisplayMode(String s) {
        switch(s) {
            case "binary":
                whichMode = "binary";
                break;
            case "octal":
                whichMode = "octal";
                break;
            case "decimal":
                whichMode = "decimal";
                break;
            case "hexadecimal":
                whichMode = "hexadecimal";
                break;
            default:
                System.out.println("Invalid mode");
                System.out.println("Mode Not changed");
        }
        return whichMode;
        
    }

    public String getMode() {
        return whichMode;
    }
}