package org.loops_array.main;

import org.loops_array.helper.MenuData;
import org.loops_array.helper.Utils;
import org.loops_array.usingMethods.Task1ArrayWithLoops;
import org.loops_array.usingMethods.Task2SplitString;
import org.loops_array.usingMethods.Task3PrintPyramid;

import static org.loops_array.helper.Utils.printMenu;

public class Menu {
    Task1ArrayWithLoops firstTask = new Task1ArrayWithLoops();//Declare and instantiate an object first task of type Task1ArrayWithLoops
    Task2SplitString task2Menu = new Task2SplitString();
    Task3PrintPyramid pyramidTask = new Task3PrintPyramid();

    public void task1Menu() {
        int menuChoice;
        do {
            printMenu(MenuData.firstTaskMenu);
            menuChoice = Utils.scanner.nextInt();
            try {
                switch (menuChoice) {
                    case 1:
                        firstTask.initializeArray();
                        firstTask.displayArrayWithForLoop();
                        firstTask.printArray();
                        System.out.println();
                    case 2:
                        firstTask.initializeArray();
                        firstTask.displayArrayWithForEachLoop();
                        firstTask.printArray();
                        System.out.println();
                    case 3:
                        firstTask.initializeArray();
                        firstTask.displayArrayWithWhileDoLoop();
                        firstTask.printArray();
                        System.out.println();
                    case 4:
                        firstTask.initializeArray();
                        firstTask.displayArrayWithDoWhileLoop();
                        firstTask.printArray();
                        System.out.println();
                }
            } catch (Exception e) {
                System.out.println("You have entered a wrong option number. Please enter an integer between 0 and 4");
                Utils.scanner.nextInt();
            }
        } while (menuChoice != 0);
    }

    public void task2Menu(){
        task2Menu.usingHashMapMethod();
    }
    public void task3Menu() {
        int menuChoice;
        do {
            printMenu(MenuData.thirdTaskMenu);
            menuChoice = Utils.scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    pyramidTask.printPyramid();
                case 2:
                    pyramidTask.printInversedPyramid();
            }
        } while (menuChoice != 0);
    }
}


