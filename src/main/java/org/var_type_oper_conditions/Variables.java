package org.var_type_oper_conditions;

public class Variables {
    public static void main(String[] args) {
        /*
        block comment*/

        //type variableName = value;
        final int numar1 = 10;
        String string1 = "Hello";
        boolean booleanVar = false;
        float floatNr1   = 10.34f;
        char carEx = 'w';

        System.out.println(floatNr1 + " -> " + numar1 + " -> " + string1 + " -> " + floatNr1 + " -> " + carEx);

        //how to declare and what is final a var?

        //how to cast
        int testCasting = (int) floatNr1;

        System.out.println(testCasting);
    }
}
