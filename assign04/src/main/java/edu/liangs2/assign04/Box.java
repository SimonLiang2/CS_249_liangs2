package edu.liangs2.assign04;

public class Box {

    private int startRow = 0;
    private int startCol = 0;
    private int endRow = 0;
    private int endCol = 0;
    private boolean isFilled = false;

    private char drawChar = ' ';

    public Box(int sr, int sc, int er,int ec, boolean filled, char drawChar){
        startRow = sr;
        startCol = sc;
        endRow = er;
        endCol = ec;
        isFilled = filled;
        this.drawChar = drawChar;
    }

    public String toString(){
        if(isFilled){
            return "Filled Box from (" + startRow + "," + startCol + ") to ("
                    + endRow + "," + endCol + ") with char '" + drawChar + "'";
        }
        else{
            return "Box from (" + startRow + "," + startCol + ") to ("
                    + endRow + "," + endCol + ") with char '" + drawChar + "'";
        }
    }

    public void draw(ScreenBuffer s) {
        if (isFilled) {
            for (int i = startRow; i <= endRow; i++) {
                for (int j = startCol; j <= endCol; j++) {
                    s.setPos(i, j, drawChar);
                }
            }
        }
        else{

                for (int i = startRow; i <= endRow; i++) {
                    s.setPos(i,startCol,drawChar);
                    s.setPos(i,endCol,drawChar);
                }
                for (int j = startCol; j <= endCol; j++){
                    s.setPos(startRow,j,drawChar);
                    s.setPos(endRow,j,drawChar);
                }


        }
    }
}
