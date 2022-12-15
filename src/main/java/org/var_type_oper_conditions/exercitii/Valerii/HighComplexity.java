package org.var_type_oper_conditions.exercitii.Valerii;

import java.util.Scanner;

public class HighComplexity {
    public static void main(String[] args) {
        /* 9. In troduceti de la tastiera o valoare si la apasarea tastei ENTER ar trebuii s-a ne afiseze
        mesajul "Valoare {{value}} introdusa este de tip {{tipul valorii}}" */
        System.out.println("Introduceti o valoare: ");
        Scanner keyboard = new Scanner(System.in);
        String stringInput = null;

        if (keyboard.hasNextBoolean()) {
            boolean boolInput = keyboard.nextBoolean();
            System.out.println("Valoarea " + boolInput + "introdusa este de tip boolean.");
        } else if (keyboard.hasNextInt())  {
            int intNumber = keyboard.nextInt();
            System.out.println("Valoarea " + intNumber + " introdusa este de tip integer");
        } else if (keyboard.hasNextFloat()) {
            float floatNumber = keyboard.nextFloat();
            System.out.println("Valoarea " + floatNumber + " introdusa este de tip float.");
        } else if (keyboard.hasNextDouble()) {
            double doubleNumber = keyboard.nextDouble();
            System.out.println("Valoarea " + doubleNumber + " introdusa este de tip double.");
        }
         else
        System.out.println("Valoarea " + stringInput + " introdusa este de tip String.");

        /* 10. Introduceti de la tastiera doua valori int, dupa introducerea valorilor vom primi o inversare a valorilor*/
        //---------------Varianta I(SWAP folosind variabila o temporara(sau 2 variabile teporare):----------------------

        Scanner userInput = new Scanner(System.in);

        System.out.print("Introduceti 2 valori Integer:\na = ");
        int firstInt = userInput.nextInt();
        System.out.print("b = ");
        int secondInt = userInput.nextInt();
        int inversedFirstInt, inversedSecondInt;
        inversedFirstInt = secondInt;
        inversedSecondInt = firstInt;

        System.out.println("Variabilele a = " + firstInt + " si b = " + secondInt + " au fost inversate si acum au valorile a= " + inversedFirstInt + " si b= " + inversedSecondInt);

        //----------------------Varianta II (SWAP fara a folosi o variabila temp)---------------------------------------
        System.out.print("Introduceti 2 valori Integer:\na = ");
        int a = userInput.nextInt();
        System.out.print("b = ");
        int b = userInput.nextInt();
        a = b - a;
        b = a + b;
        a = b - a;
        System.out.println("Variabilele a = " + b + " si b = " + a + " au fost inversate si acum au valorile a= " + a + " si b= " + b);
    }
    }

