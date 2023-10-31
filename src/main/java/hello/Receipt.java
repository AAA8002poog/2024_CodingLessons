package main.java.hello;

import java.util.Scanner;

public class Receipt {

    static Scanner      scanner  = new Scanner(System.in);
    static final double TAX_RATE = 0.13;

    public static void main(String[] args) {
        System.out.println("Please enter the cost: ");
        double cost = scanner.nextDouble();
        System.out.println("The CRA wants: $" + (cost * TAX_RATE));


    }
}
