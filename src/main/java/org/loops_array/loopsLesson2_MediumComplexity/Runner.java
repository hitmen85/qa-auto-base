package org.loops_array.loopsLesson2_MediumComplexity;

import org.loops_array.usingMethods.Task2MediumComplexity;
import org.loops_array.usingMethods.Task3MediumComplexity;

import java.util.Scanner;

public class Runner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        LoopsTask1_MediumComplexity firstTask = new LoopsTask1_MediumComplexity();
        Task2MediumComplexity secondTask = new Task2MediumComplexity();
        Task3MediumComplexity thirdTask = new Task3MediumComplexity();

        System.out.println("""
                Task 1: Populate and display with help of For, For Each, While, DoWhile an NxM array with random characters [A-Z][0-9]
                Task 2: Parse the following string: 'id-12,nume-Vasile,oras-Chisinau,mobil-0223187473232,parola-njad72DSSa2' and assing each parsed value to a variable
                Task 3: Declare N x M array and display an upside-down pyramid made of user-input character having N x M dimensions
                Task 4: Rotate 180° the Task 3 resulted image

                Please insert the number of the Task you want to view:""");

        int num = scan.nextInt();
        String option;

        if (num == 1) {
                firstTask.setArraySize();
                System.out.println("Please type the loop name for the loop you want to be used for array demonstration: \nfor, foreach, while OR dowhile");
                option = scan.next();
            switch (option.toLowerCase()) {
                case "for" -> firstTask.displayArrayWithForLoop();
                case "foreach" -> firstTask.displayWithForEachLoop();
                case "while" -> firstTask.displayArrayWithWhileDoLoop();
                case "dowhile" -> firstTask.displayWithDoWhileLoop();
            }
        } else if (num == 2) {
            String str = "id-12,nume-Vasile,oras-Chisinau,mobil-0223187473232,parola-njad72DSSa2";
            System.out.println("""
                    Please choose one option:\s
                    1 - display parsed string using HashMap\s
                    2 - display parsed string using Array List""");
            int option2 = scan.nextInt();
            switch (option2) {
                case 1 -> {
                    System.out.println("\n------------Parsed string using HashMap:----------- ");
                    secondTask.primaVersiune(str);
                }
                case 2 -> {
                    System.out.println("\n------------Parsed string using Array List:----------- ");
                    secondTask.aDouaVersiune(str);
                }
            }
        } else if (num == 3) {
            thirdTask.printPyramid();
            thirdTask.printInversedPyramid();
        }
    }
}
