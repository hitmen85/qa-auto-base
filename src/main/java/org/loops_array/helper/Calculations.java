package org.loops_array.helper;

import java.util.Arrays;
import java.util.Objects;


public class Calculations {
    String diagonal, operator;
    public double[] tempArray;
    public ArrayAttribute arrayAttribute = new ArrayAttribute();
    String operand = "null";


    public double[] makeCalculation() {
        System.out.println("Type + OR - OR * OR / to obtain respective calculations of the " + diagonal.toUpperCase() + " diagonal: ");
        operator = Utils.scanner.next();


        switch (operator) {
            case "+" : {
                for (int i = 0; i < arrayAttribute.getArray()[0].length; i++) {
                    double calc = 0.00;
                    for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                        calc += arrayAttribute.getArray()[i][j];
                    }
                    tempArray[i] = calc;
                    operand = "SUM";
                }
            }

            case "-" : {
                for (int i = 0; i < arrayAttribute.getArray()[0].length; i++) {
                    double calc = 0.00;
                    for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                        calc -= arrayAttribute.getArray()[i][j];
                    }
                    tempArray[i] = calc;
                    operand = "DIFFERENCE";
                }
            }

            case "*" : {
                for (int i = 0; i < arrayAttribute.getArray()[0].length; i++) {
                    double calc = 1.00;
                    for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                        calc *= arrayAttribute.getArray()[i][j];
                    }
                    tempArray[i] = calc;
                    operand = "MULTIPLICATION";
                }
            }

            case "/" : {
                for (int i = 0; i < arrayAttribute.getArray()[0].length; i++) {
                    double calc = 1.00;
                    for (int j = 0; j < arrayAttribute.getArray()[i].length; j++) {
                        calc /= arrayAttribute.getArray()[i][j];
                    }
                    tempArray[i] = calc;
                    operand = "DIVISION";
                }
            }

        }
        return tempArray;
    }

    public void makeDiagonalCalculation(){
        System.out.println("Type 'right' to calculate RIGHT diagonal");
        System.out.println("Type 'left' to calculate LEFT diagonal");
        diagonal = Utils.scanner.next();
        makeCalculation();

        System.out.println(tempArray);
    }


//            for (int j = 0; j < arrayAttribute.getArray()[i].length; j++)
//                if ((Objects.equals(diagonal, "right") && (i + j == (arrayAttribute.getCol() - 1))) || ((Objects.equals(diagonal, "left")) && (i == j))) {
//                    if (Objects.equals(operator, "+")) {
//                        arrayAttribute.getArray()[i][j] = arrayAttribute.getArray()[i][j] + calc;
//                        operand = "sum";
//                    } else if (Objects.equals(operator, "-")) {
//                        calc = arrayAttribute.getArray()[i][j] - calc;
//                        operand = "difference";
//                    } else if (Objects.equals(operator, "*")) {
//                        calc = arrayAttribute.getArray()[i][j] * calc;
//                        operand = "multiplication";
//                    } else if (Objects.equals(operator, "/")) {
//                        calc =  arrayAttribute.getArray()[i][j] / calc;
//                        operand = "division";
//                    } else throw new RuntimeException("Wrong operator format");
//                }
//        }
//        System.out.println("Modified array with " + operand + " of all " + diagonal.toUpperCase() + " elements is:");
//        Utils.printArray();

}
