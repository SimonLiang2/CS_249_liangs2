package edu.liangs2.exercises03;

import java.util.Scanner;
public class FoodRationer {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total food:");
        double totalFood = input.nextDouble();
        Supplies supplies = new Supplies();
        String [] names = {"Luke", "Han", "Leia"};
        Party party = new Party(names);
        int partyCnt = 5;
        double rations = 10.0;

        double daysLeft = totalFood/rations+partyCnt;

        System.out.println("\nDAYS LEFT:" + daysLeft);


    }
}
