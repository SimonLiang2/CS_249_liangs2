package edu.liangs2.assign06;
import edu.liangs2.assign04.ScreenBuffer;

public class Skeleton extends Creature{

    public Skeleton(){

    }

    public Skeleton(int row, int col){
        super(row,col);
    }

    public String toString(){
        return "Skeleton at " + getRow() + "," + getCol();
    }

    public void draw(ScreenBuffer map){
        map.setPos(row, col,'S');
    }
}
