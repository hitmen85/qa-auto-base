package org.loops_array.helper;

public class Calculations {

    public double[] calculateDiagonal(String[][] intArray) {
        String operator = Utils.scanner.next();
        double[] tempArray = new double[intArray.length];
        double result;

        switch (operator) {
            case "+" -> {
                for (int i = 0; i < intArray[0].length; i++) {
                    result = 0;
                    for (int j = 0; j < intArray[i].length; j++) {
                        result += Integer.parseInt(intArray[j][i]);
                    }
                    tempArray[i] = result;
                }
            }

            case "-" -> {
                for (int i = 0; i < intArray[0].length; i++) {
                    result = 0;
                    for (int j = 0; j < intArray[i].length; j++) {
                        result -= Integer.parseInt(intArray[j][i]);
                    }
                    tempArray[i] = result;
                }
            }

            case "*" -> {
                for (int i = 0; i < intArray[0].length; i++) {
                    result = 1;
                    for (int j = 0; j < intArray[i].length; j++) {
                        result *= Integer.parseInt(intArray[j][i]);
                    }
                    tempArray[i] = result;
                }
            }

            case "/" -> {
                for (int i = 0; i < intArray[0].length; i++) {
                    result = Integer.parseInt(intArray[0][i]);
                    for (int j = 1; j < intArray[i].length; j++) {
                        result /= Integer.parseInt(intArray[j][i]);
                    }
                    tempArray[i] = result;
                }
            }

        }
        return tempArray;
    }
}