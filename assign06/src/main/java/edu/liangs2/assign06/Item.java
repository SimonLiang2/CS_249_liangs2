package edu.liangs2.assign06;
import java.util.*;

public class Item implements Loadable{



    public void load(Scanner input) throws GameFileException{
        String ID = "";
        int value =0;
        try{
            ID = input.next();
            value = input.nextInt();

        }
        catch (Exception e){
            ID = "";
            value = 0;


        }
    };
}
