package org.loops_array.main;

public class MainMenu {
    private String[] MainMenu = {
            "1 - Display random array with for, for each, while si do while loops",
            "2 - Parse a String and assign it to variables",
            "3 - Print an upside-down pyramid",
            "4 - Print a pyramid(Inverse by 180° 3rd Task result)",
            "5 - Print random generated int array with calculation of diagonal",
            "6 - Print rotated by 90 degrees array",
            "0 - Exit"
    };

    public String[] getMainMenu() {
        return this.MainMenu;
    }

    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Choose option to be executed: ");
    }
}
