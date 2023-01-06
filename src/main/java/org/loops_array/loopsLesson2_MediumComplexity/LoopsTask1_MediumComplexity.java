package org.loops_array.loopsLesson2_MediumComplexity;

import java.util.Random;
import java.util.Scanner;

public class LoopsTask1_MediumComplexity {
    //This task is refactored Task 1: Declarati un array N x M si populatil cu for, for each, while si do while
    private static final Scanner scan = new Scanner(System.in);
    private static final Random random = new Random();
    private final String str = "abcdefghijklmnopqrstuvwxyz1234567890";
    protected char [][] array;
    private int rows, columns;

    public void setArraySize() {
        System.out.println("Enter the number of array rows: ");
        setRows(scan.nextInt());
        System.out.println("Enter the number of array columns: ");
        setColumns(scan.nextInt());
        this.array = new char[rows][columns];
    }

    public void displayArrayWithForLoop() {
        System.out.println("\n--------------Array with FOR loop-------------------\n");
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[0].length; j++) {
                this.array[i][j] = str.charAt(random.nextInt((str.length())));
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println();
        }
    }

    protected void displayWithForEachLoop(){
        System.out.println("\n--------------Array with For Each loop-------------------\n");
        int i = 0;
        for (char[] array : this.array) {
            int j = 0;
            for (char ch  : array) {
                this.array[i][j] = str.charAt(random.nextInt((str.length())));
                System.out.print(this.array[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    protected void displayArrayWithWhileDoLoop(){
        System.out.println("\n--------------Array with WHILE loop-------------------\n");
        int i = 0;
        while (getRows() > i) {
            int j = 0;
            while (getColumns() > j) {
                this.array[i][j] = str.charAt(random.nextInt((str.length())));
                System.out.print(this.array[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    protected void displayWithDoWhileLoop() {
        System.out.println("\n--------------Array with DO WHILE loop-------------------\n");
        int i = 0;
        int j = 0;
        do {
            do {
                this.array[i][j] = str.charAt(random.nextInt((str.length())));
                System.out.print(this.array[i][j] + " ");
                i++;
            }
            while (i < this.array.length);
            System.out.println();
            i = 0;
            j++;
        }
        while (j < this.array[0].length);
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
