package org.loops_array.usingMethods;

import java.util.Scanner;

public class Task3PrintPyramid {
    Scanner scan = new Scanner(System.in);
    int row, col;
    String ch;

    public void askForPrintPiramidDetails() {
        System.out.print("Enter array dimensions \nWidth: ");
        row = scan.nextInt();
        System.out.print("Hight: ");
        col = scan.nextInt();
        System.out.print("Enter a symbol: ");
        ch = scan.next();
    }

    public void printPyramid() {
        askForPrintPiramidDetails();
        System.out.println("See below the resulted pyramid: ");
        int i, j;

        //Loop thru number of rows
        for (i = row; i >= 1; i--) {

            // Inner loop print space
            for (j = i; j < col; j++) {
                System.out.print(" ");
            }

            // Inner loop print star
            for (j = 0; j <= (2 * i) - 1; j += 2) {
                System.out.print(ch + " ");
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
        for (int i = 0; i < row; i++) {
            int j = 0;
            // Inner loop print space
            for (j = col - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Inner loop print star
            for (j = 0; j <= i; j++)
                if (j == i) {
                    System.out.print(ch);
                } else
                    System.out.print(ch + " ");
            System.out.println();
        }
        System.out.println();
    }
}