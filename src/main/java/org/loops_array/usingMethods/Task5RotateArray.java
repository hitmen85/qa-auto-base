package org.loops_array.usingMethods;

import org.loops_array.helper.Utils;

public class Task5RotateArray {
    public static Utils utils = new Utils();

    //function to rotate the matrix by 90 degrees clockwise
    public static String[][] rightRotate(String[][] matrix, int rowLength) {
        //determines the transpose of the matrix(rows swapped with columns)
        for (int i = 0; i < rowLength; i++) {
            for (int j = i; j < rowLength; j++) {
                String temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //then we reverse the elements of each row
        for (int i = 0; i < rowLength; i++) {
            //logic to reverse each row
            int low = 0, high = rowLength - 1;
            while (low < high) {
                String temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
        return matrix;
    }

    public static void askForDegreesToRotateMatrix() {
        System.out.println("\nChoose one option:\n" +
                "1 - Rotate matrix by 90 degrees.\n" +
                "2 - Rotate matrix by 180 degrees.\n" +
                "3 - Rotate matrix by 270 degrees.\n");
    }

    public void rotateMatrixByXDegrees() {
        utils.initializeArray();
        utils.generateRandomIntArray();
        utils.printArray();
        askForDegreesToRotateMatrix();
        int degrees = Utils.scanner.nextInt();

        String[][] matrix = Utils.arrayAttribute.getArray();
        int arrayLength = Utils.arrayAttribute.getRow();

        if (degrees == 1) {
            Utils.arrayAttribute.setArray(rightRotate(matrix, arrayLength));
            System.out.println();
            utils.printArray();
            System.out.println();
        } else if (degrees == 2) {
            Utils.arrayAttribute.setArray(rightRotate(rightRotate(matrix, arrayLength), arrayLength));
            System.out.println();
            utils.printArray();
            System.out.println();
        } else if (degrees == 3) {
            Utils.arrayAttribute.setArray(rightRotate(rightRotate(rightRotate(matrix, arrayLength), arrayLength), arrayLength));
            System.out.println();
            utils.printArray();
            System.out.println();
        } else
            System.out.println("You have entered a wrong option. Please enter again!\n");
    }
}
