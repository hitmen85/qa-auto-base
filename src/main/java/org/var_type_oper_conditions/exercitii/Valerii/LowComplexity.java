package org.var_type_oper_conditions.exercitii.Valerii;

public class LowComplexity {
    public static void main(String[] args) {
        /*COMPLEXITATE MICA
        //1. Atribuirea valorii variabilelor de tip Int, Boolean, Double */
        int diagonal = 60;
        boolean gameOver = false;
        double area = 20.25;

        //2. Demonstrarea in cod a unei variabile primitive si a unei non-primitive (nu String) */
        float primitive = 10.1234f;  /* Float - primitiva */
        float NonPrimitive[] = {10.1234f, 11.12f, 12.123f, 13.1f, 14.12345f}; /* Array - non-primitiva */
        System.out.println("Numarul " + primitive + " este de tip float");
        System.out.println("Masivul NonPrimitive contine: " + NonPrimitive.length + " elemente.");

        //* 3. Completati spatiili libere */
        float a = 10.99f;
        char b = 'B';
        float c = 3.4f, t = 2.2f;

        //* 4. Diferanta intre double si float */
        /* Variabila de tip Double poate stoca tipul de date float, pe cind float nu poate stoca tip double(doar float).
        Deasemeni difera dupa numarul de decimale dupa virgula (precizie).
         */
        double diff = 10.99;
        double diff1 = 10.9f;
    }
}
