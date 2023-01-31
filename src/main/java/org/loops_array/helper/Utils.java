package org.loops_array.helper;

import java.util.Random;
import java.util.Scanner;

public class Utils implements ArrayFromConsole {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static String customerData = "id-12,nume-Vasile,oras-Chisinau,mobil-0223187473232,parola-njad72DSSa2";

    public static void printMenu(String[] menuOptions) {
        for (String str : menuOptions) {
            System.out.println(str);
        }
        System.out.println("\nSelect a task to be executed: ");
    }

    public ArrayAttribute arrayAttribute = new ArrayAttribute();


    @Override
    public void initializeArray() {
        System.out.println("Enter number of array rows: ");
        arrayAttribute.setRow(Utils.scanner.nextInt());
        System.out.println(arrayAttribute.getRow());
        System.out.print("Enter number of array columns: ");
        arrayAttribute.setCol(Utils.scanner.nextInt());
        System.out.println(arrayAttribute.getCol());
        arrayAttribute.setArray(new int[arrayAttribute.getRow()][arrayAttribute.getCol()]);
    }

    public void generateRandomIntArray() {
        for (int i = 0; i < arrayAttribute.getArray().length; i++) {
            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                arrayAttribute.getArray()[i][j] = Utils.random.nextInt(99);
            }
        }
    }

    @Override
    public void printArray() {
        System.out.println("Generated random int array is: ");
        for (int i = 0; i < arrayAttribute.getArray().length; i++){
            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                System.out.print(arrayAttribute.getArray()[i][j] + " ");
            }
            System.out.println();
        }
    }
//    public static void printMenu(String menuOptions) {
//        System.out.println(menuOptions);
//        System.out.println("Choose option to be executed: ");
//    }
}
