package org.loops_array.loopsLesson2_MediumComplexity;

public class arrayHelper {

    private int row, col;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    protected void initializeArray() {
        char [][] array = new char[row][col];
    }

}
