package edu.liangs2.exercises06;

import java.util.Scanner;

public class L33tSpeak {

    public static String makeL33t(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            c = switch(c){
                case 'a', 'A' -> '4';
                case 'e', 'E' -> '3';
                case 'i', 'I' -> '2';
                case 'o', 'O' -> '1';
                default -> c;
            };
            sb.append(c);
        }
        return sb.toString();
    }




    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String s = "";
        do {
            System.out.println("Enter line:");
            s = input.nextLine();
            String out = makeL33t(s);
            System.out.println(out);
        }while (s.length()!= 0);
    }







}
