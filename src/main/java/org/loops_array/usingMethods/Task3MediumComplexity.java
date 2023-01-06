package org.loops_array.usingMethods;

import java.util.Scanner;

public class Task3MediumComplexity {
    Scanner scan = new Scanner(System.in);
    int i, j, row, col;
    String ch;

    public void printPyramid() {
        System.out.print("Enter array dimensions \nWidth: ");
        int row = scan.nextInt();
        System.out.print("Hight: ");
        int col = scan.nextInt();
        System.out.print("Enter a symbol: ");
        ch = scan.next();
        System.out.println("\nPrint piramid:");

        for (i = 1; i >= row; i++) {
            for (j = 1; j < col; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i) - i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void printInversedPyramid() {
        System.out.print("Enter array dimensions \nWidth: ");
        int row = scan.nextInt();
        System.out.print("Hight: ");
        int col = scan.nextInt();
        System.out.print("Enter a symbol: ");
        ch = scan.next();
        System.out.println("Print inversed piramid:\n");
        for (i = 0; i < col; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
                if (j == i) {
                    System.out.print(ch);
                } else
                    System.out.print(ch + " ");
            col--;
            row--;
            System.out.println();
        }
    }
}