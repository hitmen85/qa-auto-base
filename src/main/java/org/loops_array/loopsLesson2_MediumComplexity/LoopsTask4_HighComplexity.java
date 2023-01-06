package org.loops_array.loopsLesson2_MediumComplexity;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class LoopsTask4_HighComplexity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter array dimensions: \nWidth: ");
        int m = scan.nextInt();
        System.out.print("Hight: ");
        int n = scan.nextInt();

        int[][] array = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                array[row][col] = random.nextInt(99);
            }
        }

        System.out.println("Generated array: \n");
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

        System.out.print("\nType 'left' to calculate left diagonal, or 'right' to calculate right diagonal: ");
        String diagonal = scan.next();
        System.out.print("Type + OR - OR * OR / to select the operation type on the diagonal elements: ");
        String operator = scan.next();
        int operation = 0;
        String operand = null;

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < m; col++)
                if ((Objects.equals(diagonal, "right") && (row + col == (n - 1))) || ((Objects.equals(diagonal, "left")) && (row == col))) {
                    if (Objects.equals(operator, "+")) {
                        array[row][col] += array[row][col];
                        operand = "sum";
                    } else if (Objects.equals(operator, "-")) {
                        array[row][col] -= array[row][col];
                        operand = "difference";
                    } else if (Objects.equals(operator, "*")) {
                        array[row][col] *= array[row][col];
                        operand = "multiplication";
                    } else if (Objects.equals(operator, "/")) {
                        array[row][col] /= array[row][col];
                        operand = "division";
                    } else
                        throw new RuntimeException("Wrong operator format");
                }
        }
        System.out.println("Modified array with " + operand + " of all " + diagonal + " elements is:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
