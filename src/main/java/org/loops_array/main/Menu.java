package org.loops_array.main;

import org.loops_array.helper.MenuData;
import org.loops_array.helper.Utils;
import org.loops_array.usingMethods.*;

import static org.loops_array.helper.Utils.printMenu;

public class Menu {
    Task1ArrayWithLoops firstTaskMenu = new Task1ArrayWithLoops(); //Declare and instantiate an object first task of type Task1ArrayWithLoops
    Task2SplitString task2Menu = new Task2SplitString(); //Declare and instantiate an object task2Menu of type Task2SplitString
    Task3PrintPyramid task3Menu = new Task3PrintPyramid(); //Declare and instantiate an object task3Menuof type Task3PrintPyramid
    Task4DiagonalOperations task4Menu = new Task4DiagonalOperations(); //Declare and instantiate an object task3Menu of type Task4DiagonalOperations
    Task5RotateArray task5Menu = new Task5RotateArray(); //Declare and instantiate an object task5Menu of type Task5RotateArray

    protected void task1Menu() {
        int menuChoice;
        do {
            printMenu(MenuData.firstTaskMenu);
            menuChoice = Utils.scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    firstTaskMenu.initializeArray();
                    firstTaskMenu.displayArrayWithForLoop();
                    firstTaskMenu.printArray();
                    System.out.println();
                case 2:
                    firstTaskMenu.initializeArray();
                    firstTaskMenu.displayArrayWithForEachLoop();
                    firstTaskMenu.printArray();
                    System.out.println();
                case 3:
                    firstTaskMenu.initializeArray();
                    firstTaskMenu.displayArrayWithWhileDoLoop();
                    firstTaskMenu.printArray();
                    System.out.println();
                case 4:
                    firstTaskMenu.initializeArray();
                    firstTaskMenu.displayArrayWithDoWhileLoop();
                    firstTaskMenu.printArray();
                    System.out.println();
            }
        } while (menuChoice != 0);
    }

    protected void task2Menu() {
        task2Menu.usingHashMapMethod();
    }

    protected void task3Menu() {
        int menuChoice;
        do {
            printMenu(MenuData.thirdTaskMenu);
            menuChoice = Utils.scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    task3Menu.printPyramid();
                case 2:
                    task3Menu.printInversedPyramid();
            }
        } while (menuChoice != 0);
    }

    protected void task4Menu(){
        int menuChoice;
        do {
            printMenu(MenuData.forthTaskMenu);
            menuChoice = Utils.scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    task4Menu.result();
            }
        }while (menuChoice != 0);
    }

    protected void task5Menu(){
        int menuChoice;
        do {
            printMenu(MenuData.fithTaskMenu);
            menuChoice = Utils.scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    task5Menu.rotateMatrixByXDegrees();
            }
        }while (menuChoice != 0);
    }
}


