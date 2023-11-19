package edu.liangs2.assign05;
import java.util.*;

public class Woods {

    private ArrayList <Giant> giants= new ArrayList <>();

    public Giant createGiant(String name, String typeName){
        if(name.isEmpty()){
            return null;
        }
        if(typeName.equals("GIANT")){
            return new Giant(name);
        }
        else if(typeName.equals("TROLL")){
            return new Troll(name);
        }
        else if(typeName.equals("TREE")){
            return new Tree(name);
        }
        else if(typeName.equals("ENT")){
            return new Ent(name);
        }
        else if(typeName.equals("HUORN")){
            return new Huorn(name);
        }
        else{
            return null;
        }
    }

    public boolean addGiant(String name, String typeName){
        Giant e = createGiant(name,typeName);
        if(e != null){
            giants.add(e);
            return true;
        }
        else{
            return false;
        }
    }

    public Giant getGiant(int index){
        if((index >= 0) && (index < giants.size())){
            return giants.get(index);
        }
        else{
            return null;
        }
    }

    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for(Giant g : giants){
            System.out.println("- " + g.toString());
        }

    }

    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for (Giant giant : giants) {
            if (giant instanceof Tree t) {
                System.out.println("- " + t.toString() + ": " + t.speak());
            }
        }
    }

    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for (Giant giant : giants) {
            if (giant instanceof Troll t) {
                System.out.println("- " + t.toString() + ": " + t.cook());
            }
        }
    }


}
