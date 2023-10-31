package main.java.hello;

import java.util.Scanner;

public class HelloWithName {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] varArgs) {

        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);


        System.out.println("What are you for halloween?");

        String costume = scanner.nextLine();

        System.out.println("Tick or Treat! " + "I'm a " + costume);
    }

}