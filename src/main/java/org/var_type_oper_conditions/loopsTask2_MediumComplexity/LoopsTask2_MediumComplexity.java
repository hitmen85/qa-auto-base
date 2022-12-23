package org.var_type_oper_conditions.loopsTask2_MediumComplexity;

public class LoopsTask2_MediumComplexity {
    public static void main(String[] args) {
        String str = "id-12,nume-Vasile,oras-Chisinau,mobil-0223187473232,parola-njad72DSSa2";
        String[] details = str.split(",");

        System.out.println("Prima versiune: ");
        System.out.println("Id: " + Integer.valueOf(str.substring(3,5)));
        System.out.println("Nume: " + str.substring(11,17));
        System.out.println("Oras: " + str.substring(23,31));
        System.out.println("Mobil: " + str.substring(38,51));
        System.out.println("Parola: " + str.substring(59,70));

        System.out.println("\nA doua versiune: ");
        for(String field :  details) {
            System.out.println(field);
        }
    }
}