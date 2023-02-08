package org.loops_array.helper;

public class ArrayAttribute {
    private int row;
    private int col;
    private char ch;
    private int[][] intArray;
    private String[][] Array;

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public void setRow(int row) {
        if (row <= 0) throw new ArithmeticException("You have entered and out of range value. Please enter an integer between 1 and 100");
        this.row = row;
    }
    public void setCol(int col) {
        if (col <= 0) throw new ArithmeticException("You have entered and out of range value. Please enter an integer between 1 and 100");
        this.col = col;
    }

    public int[][] getIntArray() {
        return intArray;
    }
    public void setIntArray(int[][] array) {
        this.intArray = array;
    }

    public String[][] getArray() {
        return Array;
    }
    public void setArray(String[][] Array) {
        this.Array = Array;
    }

    public void setChar(char ch){
        this.ch = ch;
    }
    public char getChar() {
        return ch;
    }
}
