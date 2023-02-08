package org.loops_array.usingMethods;

public class IndividualTask {

    public static void main(String[] args) {
        int[][] array =
                {{1, 5, 6},
                 {6, 7, 8},
                 {9, 2, 3}};
        double [] tempArray = getCalculatedDiagonal(array);

        for (double element:
             tempArray) {
            System.out.println(element);
        }
    }

    public static double[] getCalculatedDiagonal(int[][] array) {
        double[] tempArray = new double[array.length];

        for (int i = 0; i < array[0].length; i++) {
            double calc = 0.00;
            for (int j = 0; j < array[i].length; j++) {
                calc -= array[j][i];
            }
            tempArray[i] = calc;
        }
        return tempArray;
    }
}
