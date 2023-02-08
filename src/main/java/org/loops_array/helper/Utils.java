package org.loops_array.helper;

import java.util.Random;
import java.util.Scanner;

public class Utils implements ArrayBaseMethods {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static String customerData = "id-12,nume-Vasile,oras-Chisinau,mobil-0223187473232,parola-njad72DSSa2";

    public static void printMenu(String[] menuOptions) {
        for (String str : menuOptions) {
            System.out.println(str);
        }
        System.out.println("\nSelect a task to be executed: ");
    }

    public static ArrayAttribute arrayAttribute = new ArrayAttribute();

    @Override
    public void initializeArray() {
        System.out.println("Enter number of array rows: ");
        arrayAttribute.setRow(Utils.scanner.nextInt());
        System.out.print("Enter number of array columns: ");
        arrayAttribute.setCol(Utils.scanner.nextInt());
        arrayAttribute.setArray(new String[arrayAttribute.getRow()][arrayAttribute.getCol()]);
    }

    @Override
    public void printArray() {
        System.out.println("Generated random array is: ");
        for (int i = 0; i < arrayAttribute.getArray().length; i++){
            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                System.out.print(arrayAttribute.getArray()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void generateRandomIntArray() {
        for (int i = 0; i < arrayAttribute.getArray().length; i++) {
            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                arrayAttribute.getArray()[i][j] = String.valueOf(Utils.random.nextInt(1,99));
            }
        }
    }
}
