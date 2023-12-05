package edu.liangs2.assign06;
import edu.liangs2.assign04.ScreenBuffer;

public class Rat extends Creature{


    public Rat(){


    }

    public Rat(int row, int col){
        super(row,col);
    }

    public String toString(){
        return "Rat at " + getRow() + "," + getCol();
    }

    public void draw(ScreenBuffer map){
        map.setPos(row,col,'R');
    }
}
