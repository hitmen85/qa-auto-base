package org.var_type_oper_conditions.loopsTask2_MediumComplexity;

import java.util.Scanner;

public class LoopsTask3_Piramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array dimensions \n Width: ");
        int m = scan.nextInt();
        System.out.print("Hight: ");
        int n = scan.nextInt();
        System.out.print("Enter a symbol: ");
        String ch = scan.next();
        int i,j;

        System.out.println("\nPrint piramid:\n");
        for(i = 0; i < n; i++){
            for (j = n - i; j > 1;j--) {
                System.out.print(" ");
            }
            for(j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("\nPrint inversed piramid:\n");
        for (i = 0; i < m; i++)
        {
            for (j = m - n; j < m; j++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
            for (j = 0; j <= (m - n); j++)
            {
                System.out.print(" ");
            }
            n--;
        }
    }
}

