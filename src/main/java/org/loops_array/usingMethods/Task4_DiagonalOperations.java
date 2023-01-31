package org.loops_array.usingMethods;

import org.loops_array.helper.ArrayAttribute;
import org.loops_array.helper.Calculations;
import org.loops_array.helper.Utils;

    //--------Task 4: Given a bidimensional array of N x M, populate it with random int numbers,
    //---then calculate [operation] of array diagonal elements and print the newly generated array
    //---Opeartion = SUM, DIFFERENCE, MULTIPLICATION, DIVISION------------------------------------
public class Task4_DiagonalOperations {
    public static Calculations calculations = new Calculations();
    public static ArrayAttribute arrayAttribute = new ArrayAttribute();

    public int [][] initializeTwoDimArray() {
        System.out.println("Enter the number of array rows: ");
        arrayAttribute.setRow(Utils.scanner.nextInt());
        System.out.println("Enter the number of array columns: ");
        arrayAttribute.setCol(Utils.scanner.nextInt());
        arrayAttribute.setArray(new int[arrayAttribute.getRow()][arrayAttribute.getCol()]);
        for (int i = 0; i < arrayAttribute.getArray().length; i++) {
            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                arrayAttribute.getArray()[i][j] = (Utils.random.nextInt(100));
            }
        }
        return arrayAttribute.getArray();
    }

    public void printArray() {
        System.out.println("Generated random array of chars is: ");
        for (int i = 0; i < arrayAttribute.getArray().length; i++) {
            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                System.out.print(arrayAttribute.getArray()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void result() {
        initializeTwoDimArray();
        printArray();
        calculations.makeDiagonalCalculation();
    }
}
