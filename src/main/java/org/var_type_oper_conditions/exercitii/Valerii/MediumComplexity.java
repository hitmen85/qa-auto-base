package org.var_type_oper_conditions.exercitii.Valerii;

import java.util.Random;

public class MediumComplexity {
    public static void main(String[] args) {
        /* 5. Casting int to char */
        int diagonal = 60;
        double area = 20.25;
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

    }
}
