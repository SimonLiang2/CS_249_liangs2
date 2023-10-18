package edu.liangs2.assign03;
import java.util.*;

public class SilentFilm {
    public static Narrator askforNarration(Scanner input){

        String line;
        char boundaryChar;
        int numLines;

        System.out.println("Enter boundary character:");
        boundaryChar = input.nextLine().charAt(0);
        System.out.println("Enter the number of lines:");
        line = input.nextLine();
        numLines = Integer.parseInt(line);
        String [] allLines = new String [numLines];
        System.out.println("Enter lines:");
        for (int i=0; i < numLines; i++){
            line = input.nextLine();
            allLines[i] = line;
        }
        //might change n where you can add the number of lines in
        //Narrator n = new Narrator(allLines, boundaryChar, numLines);
        //TODO
        Narrator n = new Narrator(allLines, boundaryChar);
        return n;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Narrator n = askforNarration(input);
        System.out.println("Our story unfortunately begins...");
        System.out.println(n);
    }
}
