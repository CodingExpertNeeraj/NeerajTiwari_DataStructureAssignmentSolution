/**
 * 
 */
package com.GreatLearning.Construction;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Neeraj Tiwari
 *
 */
public class Main {

    public static int totalFloors;
    public static int[] totalFloorSize;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Driver myDriverObj = new Driver();
        myDriverObj.getInputs();
        myDriverObj.calculateAndPrintOrderOfConstruction(myDriverObj.totalFloorSize);
    }
}