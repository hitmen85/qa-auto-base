package org.loops_array.main;

import org.loops_array.usingMethods.Task2SplitString;
import org.loops_array.usingMethods.Task3PrintPyramid;
import org.loops_array.usingMethods.Task4_DiagonalOperations;

import static org.loops_array.main.MainMenu.printMenu;

import java.util.Scanner;

public class Runner {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        MainMenu menu = new MainMenu();
        FirstTaskMenu firstMenu = new FirstTaskMenu();
        Task2SplitString secondTask = new Task2SplitString();
        Task3PrintPyramid thirdTask = new Task3PrintPyramid();
        Task4_DiagonalOperations forthTask = new Task4_DiagonalOperations();


        int menuChoice = 1;
        while (menuChoice != 0) {
            printMenu(menu.getMainMenu());
            menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    firstMenu.FirstTaskMenu();
                    break;
                case 2:
                    secondTask.storeParsedStringIntoVariables();
                    break;
                case 3:
                    thirdTask.printPyramid();
                    break;
                case 4:
                    thirdTask.printInversedPyramid();
                    break;
                case 5:
                    forthTask.arrayWithCalculatedDiagonal();
                    break;
                case 6:
                    break;
            }
        }
    }
}
