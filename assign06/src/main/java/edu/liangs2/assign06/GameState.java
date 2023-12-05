package edu.liangs2.assign06;
import edu.liangs2.assign04.ScreenBuffer;

import java.util.*;

public class GameState implements Loadable{

    private ArrayList <Loadable> loads = new ArrayList<>();
    //TODO
    //not sure if arraylist is supposed to be used

    private ScreenBuffer map = new ScreenBuffer(12,30,'.');
    public Loadable createLoadable(String typeName) throws GameFileException{
        if(typeName.equals("Skeleton")){
            return new Skeleton();
        }
        else if(typeName.equals("Rat")){
            return new Rat();
        }
        else if(typeName.equals("Item")){
            return new Item();
        }
        else if(typeName.equals("Tome")){
            return new Tome();
        }
        else{
            throw new GameFileException("Unknown type: "+ typeName);
        }

    }

    public void load(Scanner input) throws GameFileException{
        
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n");
        sb.append(map.getDisplayString()+ "\n");
        sb.append("CREATURES:\n");
        for(Loadable s:loads){
            if(s instanceof Creature){
                sb.append("*" + s + "\n");
            }
        }
        sb.append("INVENTORY:\n");
        for(Loadable s:loads){
            if(s instanceof Item){
                sb.append("*" + s + "\n");
            }
        }
        return sb.toString();
    }
    public void save(String filename) throws GameFileException{
        //TODO

    }
}
