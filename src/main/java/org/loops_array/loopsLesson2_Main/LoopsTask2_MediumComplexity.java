package org.loops_array.loopsLesson2_Main;
import java.util.*;

public class LoopsTask2_MediumComplexity {
    public static void main(String[] args) {
    }

    public static void primaVersiune(String unparsedString){
        HashMap<String, String> devidedString = new HashMap<>();
        String [] splitByComma = unparsedString.split(",");
        for (String element: splitByComma) {
            String[] splitByDash = element.split("-");
            int i = 0;
            while (i < splitByDash.length) {
                devidedString.put(splitByDash[i], splitByDash[i+1]);
                i=+2;
            }
        }
        System.out.println(devidedString);
    }
    public static void aDouaVersiune(String unparsedString) {
        String[] details = unparsedString.split("[-,]");
        int id;
        String nume, oras, mobil, parola;
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

        id = Integer.parseInt(valueslist.get(0));
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