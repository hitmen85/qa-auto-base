package org.loops_array.main;

import org.loops_array.helper.MenuData;
import org.loops_array.helper.Utils;
import org.loops_array.usingMethods.Task2SplitString;
import org.loops_array.usingMethods.Task3PrintPyramid;
import org.loops_array.usingMethods.Task4_DiagonalOperations;

public class Runner {

    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        Task4_DiagonalOperations forthTask = new Task4_DiagonalOperations();


        int menuChoice;
        do {
            Utils.printMenu(MenuData.mainMenu);
            menuChoice = Utils.scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    menu.task1Menu();
                    break;
                case 2:
                    menu.task2Menu();
                    break;
                case 3:
                    menu.task3Menu();
                    break;
                case 4:
                    forthTask.result();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + menuChoice);
            }
        } while (menuChoice != 0);
    }
}
