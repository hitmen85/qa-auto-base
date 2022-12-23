package org.var_type_oper_conditions.loopsTask2_MediumComplexity;

import java.util.Random;
import java.util.Scanner;

public class LoopsTask1_MediumComplexity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduceti lungimea masivului m= ");
        int m = scan.nextInt();
        System.out.print("Introduceti latimea masivului n= ");
        int n = scan.nextInt();

        char[][] array1 = new char[m][n];
        int row, col;
        String str = "abcdefghijklmnopqrstuvwxyz1234567890";

        System.out.println("\n--------------Array with FOR loop-------------------\n");

        for (row = 0; row < m; row++) {
            for (col = 0; col < n; col++) {
                array1[row][col] = str.charAt(random.nextInt((str.length())));
                System.out.print(array1[row][col] + "  ");
            }
            System.out.println();
        }


        System.out.println("\n--------------Array with WHILE loop-------------------\n");
        row = 0;
        while (row < m) {
            col = 0;
            while (col < n) {
                array1[row][col] = str.charAt(random.nextInt((str.length())));
                System.out.print(array1[row][col] + "  ");
                col++;
            }
            row++;
            System.out.println();
        }

        System.out.println("\n--------------Array with DO WHILE loop-------------------\n");
        row = 0;
        col = 0;

        do {
            do {
                System.out.print(array1[row][col] + "  ");
                row++;
            }
            while (row < array1[col].length);
            System.out.println();
            row = 0;
            col++;
        }
        while (col < array1.length);
    }
}