package org.var_type_oper_conditions.loopsTask2_MediumComplexity;
import java.util.*;

import static java.sql.DriverManager.println;

public class LoopsTask2_MediumComplexity {
    public static void main(String[] args) {
        String str = "id-12,nume-Vasile,oras-Chisinau,mobil-0223187473232,parola-njad72DSSa2";
        String[] details = str.split("-|\\,");
        int id;
        String nume, oras, mobil, parola;

        System.out.println("--------------Prima versiune:------------ ");
        System.out.println("Id: " + Integer.valueOf(str.substring(3,5)));
        System.out.println("Nume: " + str.substring(11,17));
        System.out.println("Oras: " + str.substring(23,31));
        System.out.println("Mobil: " + str.substring(38,51));
        System.out.println("Parola: " + str.substring(59,70));

        System.out.println("\n------------A doua versiune:----------- ");
        List <String> varlist = new ArrayList<>();
        List <String> valueslist = new ArrayList<>();
        int i;
        for(i = 0; i < details.length; i++) {
            if (i % 2 != 0) {
                valueslist.add(details[i]);
            }
            else
                varlist.add(details[i]);
        }

        id = Integer.valueOf(valueslist.get(0));
        nume = valueslist.get(1);
        oras = valueslist.get(2);
        mobil = valueslist.get(3);
        parola = valueslist.get(4);

        System.out.println("Id: " + id);
        System.out.println("Nume: " + nume);
        System.out.println("Oras: " + oras);
        System.out.println("Mobil: " + mobil);
        System.out.println("Parola: " + parola);
    }
}