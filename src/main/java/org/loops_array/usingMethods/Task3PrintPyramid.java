package org.loops_array.usingMethods;

import org.loops_array.helper.ArrayAttribute;
import org.loops_array.helper.Utils;


public class Task3PrintPyramid {
    public ArrayAttribute arrayAttribute = new ArrayAttribute();

    public void askForPrintPiramidDetails() {
        System.out.print("Enter array dimensions \nWidth: ");
        arrayAttribute.setRow(Utils.scanner.nextInt());
        System.out.print("Hight: ");
        arrayAttribute.setCol(Utils.scanner.nextInt());
        System.out.print("Enter a symbol: ");
        arrayAttribute.setChar(Utils.scanner.next().charAt(0));
    }

    public void printPyramid() {
        askForPrintPiramidDetails();
        System.out.println("See below the resulted pyramid: ");
        int i, j;

        //Loop thru number of rows
        for (i = arrayAttribute.getRow(); i >= 1; i--) {

            // Inner loop print space
            for (j = i; j < arrayAttribute.getCol(); j++) {
                System.out.print(" ");
            }

            // Inner loop print star
            for (j = 0; j <= (2 * i) - 1; j += 2) {
                System.out.print(arrayAttribute.getChar() + " ");
            }
            // Ending line after each row
            System.out.println();
        }
        System.out.println();
    }

    public void printInversedPyramid() {
        askForPrintPiramidDetails();
        System.out.println("See below the resulted pyramid: ");

        //Outer loop to handle number of rows
        for (int i = 0; i < arrayAttribute.getRow(); i++) {
            int j = 0;
            // Inner loop print space
            for (j = arrayAttribute.getCol() - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Inner loop print star
            for (j = 0; j <= i; j++)
                if (j == i) {
                    System.out.print(arrayAttribute.getChar());
                } else
                    System.out.print(arrayAttribute.getChar() + " ");
            System.out.println();
        }
        System.out.println();
    }
}