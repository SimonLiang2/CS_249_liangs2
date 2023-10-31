package edu.liangs2.exercises02;

public class NPC {

    final String DESTINATION = "Log Truck";
    private int health = 100;
    private char relationship;

    public NPC(){
    }

    public NPC(int h, char r){
        health = h;
        relationship = r;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        health = h;
        health = Math.max(health, 0);
        health = Math.min(health, 100);
    }
    public char getRelationship(){
        return relationship;
    }

    public boolean setRelationship(char r){
        boolean valid = false;
        r = Character.toUpperCase(r);
        if(r == 'F'|| r == 'N'||r=='E'){
            relationship = r;
            valid = true;
        }
        return valid;
    }
}
