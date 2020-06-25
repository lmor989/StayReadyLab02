package com.codedifferently;

public class Memory {
    private double memValue = 0;

    // Stores current value to memory
    public void storeMemValue(double num) {
        memValue = num;
    }

    // Adds current value onto the stored memory value
    public void addValueToMemValue (double cv) {
        memValue += cv;
    }

    // Resets memory value to 0
    public void resetMemory() {
        memValue = 0;
    }

    // Gets memory value
    public double recallMem() {
        return memValue;
    }

}