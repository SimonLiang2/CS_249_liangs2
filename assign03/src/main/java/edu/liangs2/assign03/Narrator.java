package edu.liangs2.assign03;
import java.util.*;



public class Narrator {
    char boundaryChar;
    int numLines;

    int MAXLINES=4;

    String [] lines;



    public Narrator(String [] lines,char boundaryChar){
        //Need to implement stuff/functions for it to do its magic
        //TODO
        setBoundaryChar(boundaryChar);
        setLines(lines);

    }

    public char getBoundaryChar(){
        return boundaryChar;
    }

    public String getLines(){
        //TODO
        StringBuilder build = new StringBuilder();
        for (int i =0; i < numLines;i++){
            build.append(lines[i]);
            build.append("\n");
        }
        return build.toString();
    }

    public void setBoundaryChar(char boundaryChar){
        this.boundaryChar = boundaryChar;
    }

    public void setLines(String [] lines){
        //TODO
        numLines = lines.length;
        this.lines = new String[numLines];
        for (int i = 0; i < numLines; i++) {
            if (lines[i]==null){
                this.lines[i] = "";
            }
            else {
                this.lines[i] = lines[i];
            }
        }
    }
    public String generateBoundaryLine(){
        StringBuilder p = new StringBuilder();
        for(int i =0; i<50; i++) {
            p.append(getBoundaryChar());
        }
        p.append("\n");
        return p.toString();
    }

    public String generateCenteredLine(String text){
        //TODO
        int totalSpace = (50 - text.length()) -2;
        int space1= totalSpace/2;
        int space2= totalSpace - space1;

        StringBuilder centerLine = new StringBuilder();
        centerLine.append(getBoundaryChar());
        for (int i =0; i <space1; i++) {
            centerLine.append(' ');
        }
        centerLine.append(text);
        for(int i=0; i<space2; i++) {
            centerLine.append(' ');
        }
        centerLine.append(getBoundaryChar());
        centerLine.append("\n");
        return centerLine.toString();
    }

    public String toString(){

        //TODO
        if(numLines == 0){
            return "";
        }

        StringBuilder last = new StringBuilder();

        int count =0;

        int fullCards = numLines/MAXLINES;
        int lastCardLines = numLines % MAXLINES;

        for (int i = 1; i <= fullCards;i++){
            last.append(generateBoundaryLine());
            last.append(generateCenteredLine(""));
            for(int j = 1; j <= MAXLINES; j++){
                last.append(generateCenteredLine(lines[count]));
                count++;
            }
            last.append(generateCenteredLine(""));
            last.append(generateBoundaryLine());
        }


        if(lastCardLines!=0) {
            last.append(generateBoundaryLine());
            last.append(generateCenteredLine(""));
            for (int i = 1; i <= lastCardLines; i++) {
                last.append(generateCenteredLine(lines[(count)]));
                count++;
            }
            for (int i = 0; i < (MAXLINES - lastCardLines); i++) {
                last.append(generateCenteredLine(""));
            }
            last.append(generateCenteredLine(""));
            last.append(generateBoundaryLine());
        }
        return last.toString();
    }
}
