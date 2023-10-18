package edu.liangs2.assign03;


public class Narrator {
    char boundaryChar;
    public Narrator(String [] lines,char boundaryChar){
        //Need to implement stuff/functions for it to do its magic
        //TODO
    }

    public char getBoundaryChar(){
        return boundaryChar;
    }

    public String getLines(){
        //TODO
        return "";
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }

    public void setLines(String [] lines){
        //TODO
    }
    public String generateBoundaryLine(){
        StringBuilder p = new StringBuilder();
        for(int i =0; i<50; i++) {
            p.append(getBoundaryChar());
        }
        return p.toString();
    }

    public String generateCenteredLine(String text){
        //TODO
        return "";
    }

    public String toString(){
        //TODO
        return "";
    }



}
