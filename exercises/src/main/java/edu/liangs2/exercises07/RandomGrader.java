package edu.liangs2.exercises07;
import java.util.*;

public class RandomGrader {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seed: ");
        int seed = input.nextInt();

        Random rand = new Random();
        System.out.println("Enter number of students: ");
        int studentInt = input.nextInt();

        double sumGrades = 0;

        for(int i = 0; i < studentInt; i ++){
            int grade = getRandomGrade(rand);
            String letter = getLetterGrade(grade);
            sumGrades += grade;

            printGrade("Student" + i+1, grade, letter);
        }

        int avGrade = (int)Math.round(sumGrades/studentInt);
        printGrade("AVERAGE", avGrade , getLetterGrade(avGrade));
    }
    public static int getRandomGrade(Random rand){
        //TODO
        return 50 + (int)(51*rand.nextDouble());
    }

    public static String getLetterGrade(int grade){
        //TODO
        String letter = "F";
        if (grade >= 90){
            letter = "A";
        }
        else if (grade >=80){
            letter = "B";
        }
        else if(grade >=70){
            letter = "C";
        }
        else if (grade >= 60){
            letter = "D";
        }

        return letter;
    }

    public static void printGrade(String name, int grade, String letter){
        //TODO
        System.out.println(name + ": " + grade + " (");

    }

}
