package edu.liangs2.assign04;

public class ScreenBuffer {

    private char [][] array = new char [1][1];
    private int rowCnt = 0;
    private int colCnt = 0;

    private char fillChar = ' ';

    public ScreenBuffer(int rowCnt, int colCnt, char fillChar){
        this.fillChar= fillChar;
        this.rowCnt = rowCnt;
        this.colCnt= colCnt;
        array = new char [rowCnt][colCnt];
        for (int i =0; i<rowCnt; i++){
            for (int j=0; j<colCnt; j++){
                array[i][j] = fillChar;
            }
        }
    }

    public void clear(){
        for (int i =0; i<rowCnt; i++){
            for (int j=0; j<colCnt; j++){
                array[i][j] = fillChar;
            }
        }
    }

    public int getRowCnt(){
        return rowCnt;
    }
    public int getColCnt(){
        return colCnt;
    }

    public boolean isValidPosition(int row, int col){
        if(((row >=0) && (row < rowCnt)) && ((col >=0) && (col < colCnt))){
            return true;
        }
        else{
            return false;
        }
    }

    public char getPos(int row, int col){
        if (isValidPosition(row,col)){
            return array [row][col];
        }
        else{
            return ' ';
        }
    }

    public boolean setPos(int row, int col, char c){
        if(isValidPosition(row,col)){
            array [row][col]= c;
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return rowCnt + " x " + colCnt + " ScreenBuffer (default: " + fillChar + ")";
    }

    public String getDisplayString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rowCnt; i++){
            for (int j = 0; j < colCnt; j++){
                sb.append(array[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
