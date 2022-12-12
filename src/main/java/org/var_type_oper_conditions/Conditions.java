package org.var_type_oper_conditions;

public class Conditions {
    public static void main(String[] args) {

        int lungime = 10;
        int latime = 5;
        int inaltime = 5;

        // if else

        if(lungime > latime) {
            System.out.println("Lungimea este mai mare decat latimea");
        }else {
            System.out.println("Lungimea este mai mica decat latimea");
        }

        //Switch
        switch (inaltime){
            case 6:
                System.out.println("Inaltimea este 6");break;
            case 4:
                System.out.println("Inaltimea este 4");break;
                default:
                System.out.println("Inaltimea nu-i in cerinte");
        }

    }
}
