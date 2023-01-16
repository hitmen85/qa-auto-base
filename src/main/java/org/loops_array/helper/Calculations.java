package org.loops_array.helper;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public abstract class Calculations implements ArrayFromConsole {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String diagonal, operator;
    public ArrayAttribute arrayAttribute = new ArrayAttribute();


    public void initializeArray() {
        System.out.println("Enter number of array rows: ");
        arrayAttribute.setRow(scanner.nextInt());
        System.out.println(arrayAttribute.getRow());
        System.out.print("Enter number of array columns: ");
        arrayAttribute.setCol(scanner.nextInt());
        System.out.println(arrayAttribute.getCol());
        arrayAttribute.setArray(new int[arrayAttribute.getRow()][arrayAttribute.getCol()]);
    }


    public void generateRandomIntArray() {
        for (int i = 0; i < arrayAttribute.getArray().length; i++) {
            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                arrayAttribute.getArray()[i][j] = random.nextInt(99);
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

    public void printRandomIntArray() {
        initializeArray();
        generateRandomIntArray();
        printArray();
    }

    public void makeDiagonalCalculation() {
        System.out.println("Type 'right' to calculate RIGHT diagonal");
        System.out.println("Type 'left' to calculate LEFT diagonal");
        diagonal = scanner.next();
        System.out.println("Type + OR - OR * OR / to obtain respective calculations of the " + diagonal.toUpperCase() + " diagonal: ");
        operator = scanner.next();
        String operand = null;

        for (int i = 0; i < arrayAttribute.getArray().length; i++) {
            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++)
                if ((Objects.equals(diagonal, "right") && (i + j == (arrayAttribute.getCol() - 1))) || ((Objects.equals(diagonal, "left")) && (i == j))) {
                    if (Objects.equals(operator, "+")) {
                        arrayAttribute.getArray()[i][j] += arrayAttribute.getArray()[i][j];
                        operand = "sum";
                    } else if (Objects.equals(operator, "-")) {
                        arrayAttribute.getArray()[j][j] -= arrayAttribute.getArray()[i][j];
                        operand = "difference";
                    } else if (Objects.equals(operator, "*")) {
                        arrayAttribute.getArray()[i][j] *= arrayAttribute.getArray()[i][j];
                        operand = "multiplication";
                    } else if (Objects.equals(operator, "/")) {
                        arrayAttribute.getArray()[i][j] /= arrayAttribute.getArray()[i][j];
                        operand = "division";
                    } else throw new RuntimeException("Wrong operator format");
                }
        }
        System.out.println("Modified array with " + operand + " of all " + diagonal.toUpperCase() + " elements is:");
        printArray();

    }
}
