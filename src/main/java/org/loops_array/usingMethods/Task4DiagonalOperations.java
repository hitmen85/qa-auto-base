package org.loops_array.usingMethods;

import org.loops_array.helper.Calculations;
import org.loops_array.helper.Utils;

//--------Task 4: Given a bidimensional array of N x M, populate it with random int numbers,
//---then calculate [operation] of array diagonal elements and print the newly generated array
//---Opeartion = SUM, DIFFERENCE, MULTIPLICATION, DIVISION------------------------------------

public class Task4DiagonalOperations {
    public static Calculations calculations = new Calculations();
    public static Utils utils = new Utils();

    private static String diagonal;

    protected void askForOperationToBeAppliedOnDiagonal() {
        System.out.println("Type + OR - OR * OR / to obtain respective calculations of the diagonal: ");
    }

    protected void askForDiagonalToBeCalculated() {
        System.out.println("Type 'right' to calculate RIGHT diagonal");
        System.out.println("Type 'left' to calculate LEFT diagonal");
        diagonal = Utils.scanner.next();
    }

    public static void replaceWithCalculatedDiagonal(double[] tempArray) {

        for (int i = 0; i < Utils.arrayAttribute.getArray().length; i++) {
            for (int j = 0; j < Utils.arrayAttribute.getArray().length; j++) {
                if (i == j & diagonal.equalsIgnoreCase("left")) {
                    Utils.arrayAttribute.getArray()[j][i] = String.valueOf(tempArray[0]);
                }
                if ((i + j) == (Utils.arrayAttribute.getArray().length - 1) & diagonal.equalsIgnoreCase("right")) {
                    Utils.arrayAttribute.getArray()[j][i] = String.valueOf(tempArray[i]);
                }
            }
        }

    }

    public void result() {
        utils.initializeArray();
        utils.generateRandomIntArray();
        utils.printArray();
        askForDiagonalToBeCalculated();
        askForOperationToBeAppliedOnDiagonal();
        replaceWithCalculatedDiagonal(calculations.calculateDiagonal(Utils.arrayAttribute.getArray()));
        utils.printArray();
        System.out.println();
    }
}
