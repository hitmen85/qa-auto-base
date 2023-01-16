package org.loops_array.helper;

public class ArrayAttribute {
    private int row;
    private int col;
    private int[][] array;
    private char[][] charArray;

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public void setRow(int row) {
        if (row <= 0 || row > 100) throw new ArithmeticException("You have entered and out of range value. Please enter an integer between 1 and 100");
        this.row = row;
    }
    public void setCol(int col) {
        if (col <= 0 || col > 100) throw new ArithmeticException("You have entered and out of range value. Please enter an integer between 1 and 100");
        this.col = col;}

    public int[][] getArray() {
        return array;
    }
    public void setArray(int[][] array) {
        this.array = array;
    }

    public char[][] getCharArray() {
        return charArray;
    }
    public void setCharArray(char[][] charArray) {
        this.charArray = charArray;
    }
}
