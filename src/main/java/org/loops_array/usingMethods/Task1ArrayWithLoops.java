package org.loops_array.usingMethods;

import org.loops_array.helper.ArrayAttribute;
import org.loops_array.helper.ArrayFromConsole;
import org.loops_array.helper.Utils;


public class Task1ArrayWithLoops implements ArrayFromConsole {

    //This task is refactored Task 1: Declare a bidimensional array N x M and populate it with random characters using loops For, ForEach, While si Do While
    private final String str = "abcdefghijklmnopqrstuvwxyz1234567890";

    public ArrayAttribute arrayAttribute = new ArrayAttribute();

    @Override
    public void initializeArray() {
        System.out.println("Enter the number of array rows: ");
        arrayAttribute.setRow(Utils.scanner.nextInt());
        System.out.println("Enter the number of array columns: ");
        arrayAttribute.setCol(Utils.scanner.nextInt());
        arrayAttribute.setCharArray(new char[arrayAttribute.getRow()][arrayAttribute.getCol()]);
    }

    @Override
    public void printArray() {
        System.out.println("Generated random array of chars is: ");
        for (int i = 0; i < arrayAttribute.getCharArray().length; i++) {
            for (int j = 0; j < arrayAttribute.getCharArray()[i].length; j++) {
                System.out.print(arrayAttribute.getCharArray()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayArrayWithForLoop() {
        System.out.println("\n--------------Array with FOR loop-------------------\n");
        for (int i = 0; i < arrayAttribute.getCharArray().length; i++) {
            for (int j = 0; j < arrayAttribute.getCharArray()[i].length; j++) {
                arrayAttribute.getCharArray()[i][j] = str.charAt(Utils.random.nextInt((str.length())));
            }
        }
    }

    public void displayArrayWithForEachLoop() {
        System.out.println("\n--------------Array with For Each loop-------------------\n");
        int i = 0;
        for (char[] array : arrayAttribute.getCharArray()) {
            int j = 0;
            for (char ch : array) {
                arrayAttribute.getCharArray()[i][j] = str.charAt(Utils.random.nextInt((str.length())));
                j++;
            }
            i++;
        }
    }

    public void displayArrayWithWhileDoLoop() {
        System.out.println("\n--------------Array with WHILE loop-------------------\n");
        int i = 0;
        while (arrayAttribute.getRow() > i) {
            int j = 0;
            while (arrayAttribute.getCol() > j) {
                arrayAttribute.getCharArray()[i][j] = str.charAt(Utils.random.nextInt((str.length())));
                j++;
            }
            i++;
        }
    }

    public void displayArrayWithDoWhileLoop() {
        System.out.println("\n--------------Array with DO WHILE loop-------------------\n");
        int i = 0;
        int j = 0;
        do {
            do {
                arrayAttribute.getCharArray()[i][j] = str.charAt(Utils.random.nextInt((str.length())));
                i++;
            }
            while (i < arrayAttribute.getCharArray().length);
            i = 0;
            j++;
        }
        while (j < arrayAttribute.getCharArray()[0].length);
    }
}
