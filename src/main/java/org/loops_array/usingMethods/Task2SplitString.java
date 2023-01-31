package org.loops_array.usingMethods;

import org.loops_array.helper.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 //Task 2: Split string into
public class Task2SplitString {

    public void usingHashMapMethod(){
        HashMap <String, String> myHashMap = new HashMap <>();
        String[] parts = Utils.customerData.split(",");

        for (int i = 0; i < parts.length; i++) {
            String temp = parts[i];
            String[] keyValue = temp.split("-");
            myHashMap.put(keyValue[0], keyValue[1]);
            }
        String id = myHashMap.get("id");
        String name = myHashMap.get("nume");
        String city = myHashMap.get("oras");
        String phoneNumber = myHashMap.get("mobil");
        String password = myHashMap.get("parola");

        System.out.println("Id: " + id);
        System.out.println("Nume: " + name);
        System.out.println("Oras: " + city);
        System.out.println("Mobil: " + phoneNumber);
        System.out.println("Parola: " + password);
        System.out.println();
    }
//    public void storeParsedStringIntoVariables() {
//        String[] details = Utils.customerData.split("[-,]");
//        List <String> varlist = new ArrayList<>();
//        List <String> valueslist = new ArrayList<>();
//        int i;
//        for(i = 0; i < details.length; i++) {
//            if (i % 2 != 0) {
//                valueslist.add(details[i]);
//            }
//            else
//                varlist.add(details[i]);
//        }
//
//        id = valueslist.get(0);
//        nume = valueslist.get(1);
//        oras = valueslist.get(2);
//        mobil = valueslist.get(3);
//        parola = valueslist.get(4);
//
//        System.out.println("Id: " + id);
//        System.out.println("Nume: " + nume);
//        System.out.println("Oras: " + oras);
//        System.out.println("Mobil: " + mobil);
//        System.out.println("Parola: " + parola);
//    }
}
