package edu.liangs2.assign02;
import java.util.Scanner;
import edu.liangs2.assign02.Superhero;

public class League {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Superhero p = new Superhero();

        System.out.println("Enter hero name:");
        String superName = input.nextLine();
        System.out.println("Enter real name:");
        String realName = input.nextLine();
        System.out.println("Enter height (inches) and weight (pounds):");
        String hAndw = input.nextLine();
        Scanner parseLine = new Scanner(hAndw);
        int height = parseLine.nextInt();
        double weight = parseLine.nextDouble();
        p.setHeroName(superName);
        p.setRealName(realName);
        p.setHeight(height);
        p.setWeight(weight);
        System.out.println(p.toString());



    }
}
