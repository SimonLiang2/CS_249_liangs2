package edu.liangs2.assign03;
import java.util.*;

public class SilentFilm {
    public static Narrator askForNarration(Scanner input){

        String line;
        char boundaryChar;
        int numLines;
        String [] allLines;

        System.out.println("Enter boundary character:");
        boundaryChar = input.nextLine().charAt(0);
        System.out.println("Enter number of lines:");
        line = input.nextLine();
        numLines = Integer.parseInt(line);
        System.out.println("Enter lines:");

        //Checks if numLines is greater than 0, otherwise error can occur
        if (numLines > 0) {
            allLines = new String[numLines];
            for (int i = 0; i < numLines; i++) {
                line = input.nextLine();
                allLines[i] = line;
            }
        }
        else{
            allLines = new String[0];
        }
        Narrator n = new Narrator(allLines, boundaryChar);
        return n;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Narrator n = askForNarration(input);
        System.out.println("Our story begins...");
        System.out.println(n);
    }
}
