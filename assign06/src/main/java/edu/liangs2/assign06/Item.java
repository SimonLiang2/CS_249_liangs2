package edu.liangs2.assign06;
import java.util.*;

public class Item implements Loadable{

    String id = "";
    int value = 0;
    public Item(){
        id = "";
        value =0;
    };

    public Item(String ID, int value){
        id = ID;
        this.value = value;
    };

    public String getID(){
        return id;
    }

    public int getValue(){
        return value;
    }

    public void setID(String ID){
        id = ID;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String toString(){
        return id + " with value " + value;
    }







    public void load(Scanner input) throws GameFileException{
        id = "";
        value = 0;
        try{
            id = input.next();
            value = input.nextInt();

        }
        catch (Exception e){
            id = "";
            value = 0;
            throw new GameFileException("Error loading item", e);


        }
    };
}
