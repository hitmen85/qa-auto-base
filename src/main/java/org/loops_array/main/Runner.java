package org.loops_array.main;

import org.loops_array.helper.MenuData;
import org.loops_array.helper.Utils;
import org.loops_array.usingMethods.Task5RotateArray;

public class Runner {

    public static void main(String[] args){
        Menu menu = new Menu();

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
                    menu.task4Menu();
                    break;
                case 5:
                    menu.task5Menu();
                case 0:
                    System.out.println("Program Terminated.... Thank you for choosing our product!");
                    break;
                default:
                    System.out.println("You have entered an unexpected option. Please select a task from below list to be executed: \n");
            }
        } while (menuChoice != 0);
    }
}
