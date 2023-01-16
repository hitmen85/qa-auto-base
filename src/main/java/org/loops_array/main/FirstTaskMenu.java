package org.loops_array.main;

import org.loops_array.usingMethods.Task1ArrayWithLoops;

import java.util.Scanner;

public class FirstTaskMenu extends org.loops_array.main.MainMenu {
    private String[] loopToCall = {
            "0 - Return to main Menu",
            "1 - Display array with For Loop",
            "2 - Display array with For-Each Loop",
            "3 - Display array with Do-While Loop",
            "4 - Display array with While-Do Loop",
    };

    public String[] getLoopToCall() {
        return this.loopToCall;
    }

    private static final Scanner scanner = new Scanner(System.in);
    Task1ArrayWithLoops firstTask = new Task1ArrayWithLoops() {
    };

    public void FirstTaskMenu() {
        int menuChoice;
        do {
            printMenu(getLoopToCall());
            menuChoice = scanner.nextInt();
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
            }
        } while (menuChoice != 0);
    }
}


