//Tyler Skibo
//October 2026
//This program will tell the user what their perfect pet is based on their answers to three questions: favorite color, favorite season, name

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your favorite color: red, green, blue?");
        String color = (scan.nextLine()).toLowerCase();
        if (!(color.equals("red"))  && !(color.equals("green")) && !(color.equals("blue"))){
            System.out.println("Not a real color, retry");
            return;
        }
        
        System.out.println("What is your favorite season: summer, fall, winter, or spring?");
        String season = (scan.nextLine()).toLowerCase();
        if (!(season.equals("summer"))  && !(season.equals("fall")) && !(season.equals("winter")) && !(season.equals("spring"))){
            System.out.println("Not a real season, retry");
            return;
        }
        
        System.out.println("What is your name?");
        String letter = ((scan.nextLine()).toLowerCase()).substring(0,1);
        Boolean vowel = ("aeiou".indexOf(letter) > -1);
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(letter)<0){
            System.out.println("Not a real name, retry");
            return;
        }

        if (color.equals("blue")) {
            if (season.equals("summer")){
                System.out.println("You get a pony!");
            }
            else if (season.equals("fall")) {
                System.out.println("You get an alligator!");
            }
            else if (season.equals("spring")) {
                System.out.println("You get an ostrich!");
            }
            else if ((season.equals("winter")) && vowel) {
                System.out.println("You get an axolotl!");
            }
            else
                System.out.println("You get a pet rock...");
        }

         if (color.equals("green")) {
            if ((season.equals("summer"))){
                System.out.println("You get a dog!");
            }
            else if ((season.equals("spring")) && vowel){
                System.out.println("You get a dog!");
            }
            else if ((season.equals("winter")) && vowel) {
                System.out.println("You get a dog!");
            }
            else if ((season.equals("winter")) && !vowel) {
                System.out.println("You get a giraffe!");
            }
            else
                System.out.println("You get a pet rock...");
            
        }
        if (color.equals("red")) {
            if (vowel){
                System.out.println("You get a porcupine!");
            }
            else if (!vowel){
                System.out.println("You get a panda!");
            }
            else
                System.out.println("You get a pet rock...");
        }
    }
}