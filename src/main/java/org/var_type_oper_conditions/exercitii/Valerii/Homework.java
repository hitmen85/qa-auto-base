package org.var_type_oper_conditions;

import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*COMPLEXITATE MICA
        1. Atribuirea valorii variabilelor de tip Int, Boolean, Double */
        int diagonal = 60;
        boolean gameOver = false;
        double area = 20.25;

        /*COMPLEXITATE MICA
        2. Demonstrarea in cod a unei variabile primitive si a unei non-primitive (nu String) */
        float primitive = 10.1234f;  /* Float - primitiva */
        float NonPrimitive []  = {10.1234f, 11.12f, 12.123f, 13.1f, 14.12345f}; /* Array - non-primitiva */
        System.out.println("Numarul " + primitive + " este de tip float");
        System.out.println("Masivul NonPrimitive contine: " + NonPrimitive.length + " elemente.");

        /* 3. Completati spatiili libere */
        float a = 10.99f;
        char b = 'B';
        float c = 3.4f, t = 2.2f;

        /* 4. Diferanta intre double si float */
        // Variabila de tip Double poate stoca tipul de date float, pe cind float nu poate stoca tip double(doar float)
        double diff = 10.99;
        double diff1 = 10.9f;

        /* 5. Casting int to char */
        char castedInteger = (char)diagonal;
        System.out.println("Casted Int to char is: " + castedInteger);

        /* 6. Casting double to int */
        int castedDouble = (int)area;
        System.out.println("Casted Double to int is: " + castedDouble);

        /* 7. Transform int in string si string in int */
        String s = String.valueOf(diagonal);
        System.out.println("Casted Int to String is: " + s);
        String s1 = "100";
        int castedString = Integer.valueOf(s1);
        System.out.println("Casted String to int is: " + castedString);

        /* 8. Generati random valorea pentru o variabila de int, char si string */
        Random random = new Random();
        int randGeneratedInt = random.nextInt(10000);
        char randGeneratedChar = (char)(random.nextInt('z' - 'a') + 'a');
        System.out.println("Random generated int: " + randGeneratedInt);
        System.out.println("Random generated char: " + randGeneratedChar);

        int stringlength = random.nextInt(6) + 10;
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        String randGeneratedString = random.ints(leftLimit, rightLimit + 1)
        .limit(stringlength)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
        System.out.println("Random generated String: " + randGeneratedString);

        /* 9. In troduceti de la tastiera o valoare si la apasarea tastei ENTER ar trebuii s-a ne afiseze mesajul "Valoare {{value}} introdusa
        este de tip {{tipul valorii}}" */
        System.out.println("Introduceti o valoare: ");
//        static void inputCharCheck(char input_char) {
//            //Verificam daca valoarea introdusa estu un caracter
//            if ((input_char >= 65 && input_char <= 90)
//                || (input_char >= 97 && input_char <= 122))
//                System.out.println("Valoarea " + input_char + " este de tip char");
//            else if (input_char >= 48 && input_char <= 57)
//                System.out.println("Valoarea " + input_char + " este de tip Int");
//            else if ((input_char >= 48 && input_char <= 57)&& (int)input_char) {
//            }
        Scanner keyboard = new Scanner(System.in);
        boolean isInt = false;
        boolean isChar = false;
        String specialCharacter = keyboard.next();
        if (keyboard.hasNextFloat()){
            float floatNumber = keyboard.nextFloat();
            if (floatNumber == (int)floatNumber) {
                isInt = true;
                System.out.println("Valoarea " + floatNumber + "introdusa este de tip float.");
            }
            else
                System.out.println("Valoarea " + (int)floatNumber + "introdusa este de tip int.");
        }
        else if (keyboard.hasNextDouble())
        {
            double doubleNumber = keyboard.nextDouble();
            System.out.println("Valoarea " + doubleNumber + "introdusa este de tip double.");
        }
        else if (keyboard.hasNextLine()){
            String stringInput = keyboard.nextLine();
            if((stringInput.length() > 1)) {
                //isChar = false;
                System.out.println("Valoarea " + stringInput + "introdusa este de tip String.");
            }
            else
                System.out.println("Valoarea " + stringInput + "introdusa este de tip char.");
        }
        else if (keyboard.hasNextBoolean()){
            boolean boolInput = keyboard.nextBoolean();
            System.out.println("Valoarea " + boolInput + "introdusa este de tip boolean.");
        }
        else
            System.out.println("Valoarea" + specialCharacter + "introdusa este de tip caracter special.");

        /* 10. Introduceti de la tastiera doua valori int, dupa introducerea valorilor vom primi o inversare a valorilor*/
/*
        //Varianta I(SWAP folosind variabila o temporara(sau 2 variabile teporare):
        Scanner userInput = new Scanner(System.in);
        System.out.println("Introduceti 2 valori Integer:\na = ");
        int firstInt = userInput.nextInt();
        System.out.println("b = ");
        int secondInt = userInput.nextInt();
        int inversedFirstInt, inversedSecondInt;
        inversedFirstInt = secondInt;
        inversedSecondInt = firstInt;

        //Varianta II (SWAP fara a folosi o variabila temp)
//      firstInt = firstInt - secondInt;
//      secondInt = firstInt + secondInt;
//      firstInt = secondInt - firstInt;

        System.out.println("Variabilele a = " + firstInt + " si b = " + secondInt + " au fost inversate si acum au valorile a= "
                + inversedFirstInt + " si b= " + inversedSecondInt);


//        try {
//            int number = userInput.nextInt();
//            float fl = userInput.nextFloat();
//            double db = userInput.nextDouble();
//            boolean bl;
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

*/
    }
}
