package com.agnes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String noun;
            String adjective2;
            String verb;
            String adjective3;

            System.out.println("Enter an adjective (description)");
            String adjective1 = scanner.nextLine();
            System.out.println("Enter an noun (animal or person)");
            noun = scanner.nextLine();
            System.out.println("Enter an adjective (description)");
            adjective2 = scanner.nextLine();
            System.out.println("Enter an verb  ending with -ing (action)");
            verb = scanner.nextLine();
            System.out.println("Enter an adjective (description)");
            adjective3 = scanner.nextLine();


            System.out.println ("Today I went to a " + adjective1 + "Cinema");
            System.out.println ("In an exhibit i saw a " + noun + ".");
            System.out.println (noun +  " was "  +  adjective2 +  " and " + verb + "!");
            System.out.println ("I was " + adjective3 + ".");

            scanner.close();



        }
    }