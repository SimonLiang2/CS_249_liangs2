package edu.liangs2.assign03;

public class Narrator {
    char boundaryChar;
    int numLines;

    final int MAXLINES=4;


    String [] lines;



    public Narrator(String [] lines,char boundaryChar){
        setBoundaryChar(boundaryChar);
        setLines(lines);

    }

    public char getBoundaryChar(){
        return boundaryChar;
    }

    public String getLines(){

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
        //
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

        //Created for when user decides to put 0
        if(numLines == 0){
            return "";
        }

        StringBuilder last = new StringBuilder();
        int count =0;

        //Helps determine the number of full cards
        int fullCards = numLines/MAXLINES;

        //Helps determine the number of lines from the user for the last card
        int lastCardLines = numLines % MAXLINES;

        //Fills the cards fully
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

        //This is so it won't generate a blank card if numLines is divisible by MAXLINES
        if(lastCardLines!=0) {
            //Partially fills last card
            last.append(generateBoundaryLine());
            last.append(generateCenteredLine(""));
            for (int i = 1; i <= lastCardLines; i++) {
                last.append(generateCenteredLine(lines[(count)]));
                count++;
            }
            //Fills in empty lines for last card
            for (int i = 0; i < (MAXLINES - lastCardLines); i++) {
                last.append(generateCenteredLine(""));
            }
            last.append(generateCenteredLine(""));
            last.append(generateBoundaryLine());
        }
        return last.toString();
    }
}
